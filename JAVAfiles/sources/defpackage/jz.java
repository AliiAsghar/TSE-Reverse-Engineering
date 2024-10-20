package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.database.DataSetObservable;
import android.os.AsyncTask;
import android.text.TextUtils;
import android.util.Log;
import android.util.Xml;
import j$.util.DesugarCollections;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class jz extends DataSetObservable {
    static final String a = "jz";
    private static final Object k = new Object();
    private static final Map l = new HashMap();
    final Context e;
    final String f;
    public Intent g;
    public jx j;
    public final Object b = new Object();
    public final List c = new ArrayList();
    public final List d = new ArrayList();
    private final efu p = new efu((char[]) null);
    private final int m = 50;
    boolean h = true;
    private boolean n = false;
    private boolean o = true;
    public boolean i = false;

    private jz(Context context, String str) {
        this.e = context.getApplicationContext();
        if (!TextUtils.isEmpty(str) && !str.endsWith(".xml")) {
            this.f = String.valueOf(str).concat(".xml");
        } else {
            this.f = str;
        }
    }

    public static jz e(Context context, String str) {
        jz jzVar;
        synchronized (k) {
            Map map = l;
            jzVar = (jz) map.get(str);
            if (jzVar == null) {
                jzVar = new jz(context, str);
                map.put(str, jzVar);
            }
        }
        return jzVar;
    }

    private final void h() {
        int size = this.d.size() - this.m;
        if (size > 0) {
            this.o = true;
            for (int i = 0; i < size; i++) {
            }
        }
    }

    private final void i() {
        XmlPullParser newPullParser;
        try {
            FileInputStream openFileInput = this.e.openFileInput(this.f);
            try {
                try {
                    newPullParser = Xml.newPullParser();
                    newPullParser.setInput(openFileInput, "UTF-8");
                    for (int i = 0; i != 1 && i != 2; i = newPullParser.next()) {
                    }
                } catch (IOException e) {
                    Log.e(a, "Error reading historical recrod file: " + this.f, e);
                } catch (XmlPullParserException e2) {
                    Log.e(a, "Error reading historical recrod file: " + this.f, e2);
                }
                if ("historical-records".equals(newPullParser.getName())) {
                    List list = this.d;
                    list.clear();
                    while (true) {
                        int next = newPullParser.next();
                        if (next == 1) {
                            break;
                        }
                        if (next != 3 && next != 4) {
                            if ("historical-record".equals(newPullParser.getName())) {
                                list.add(new jw(ComponentName.unflattenFromString(newPullParser.getAttributeValue(null, "activity")), Long.parseLong(newPullParser.getAttributeValue(null, "time")), Float.parseFloat(newPullParser.getAttributeValue(null, "weight"))));
                            } else {
                                throw new XmlPullParserException("Share records file not well-formed.");
                            }
                        }
                    }
                    if (openFileInput != null) {
                        try {
                            openFileInput.close();
                            return;
                        } catch (IOException unused) {
                            return;
                        }
                    }
                    return;
                }
                throw new XmlPullParserException("Share records file does not start with historical-records tag.");
            } catch (Throwable th) {
                if (openFileInput != null) {
                    try {
                        openFileInput.close();
                    } catch (IOException unused2) {
                    }
                }
                throw th;
            }
        } catch (FileNotFoundException unused3) {
        }
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [java.util.Map, java.lang.Object] */
    private final void j() {
        if (this.p != null && this.g != null && !this.c.isEmpty() && !this.d.isEmpty()) {
            efu efuVar = this.p;
            List list = this.c;
            List list2 = this.d;
            ?? r0 = efuVar.a;
            List unmodifiableList = DesugarCollections.unmodifiableList(list2);
            r0.clear();
            int size = list.size();
            for (int i = 0; i < size; i++) {
                jv jvVar = (jv) list.get(i);
                jvVar.b = brg.a;
                r0.put(new ComponentName(jvVar.a.activityInfo.packageName, jvVar.a.activityInfo.name), jvVar);
            }
            float f = 1.0f;
            for (int size2 = unmodifiableList.size() - 1; size2 >= 0; size2--) {
                jw jwVar = (jw) unmodifiableList.get(size2);
                jv jvVar2 = (jv) r0.get(jwVar.a);
                if (jvVar2 != null) {
                    jvVar2.b += jwVar.c * f;
                    f *= 0.95f;
                }
            }
            Collections.sort(list);
        }
    }

    public final int a() {
        int size;
        synchronized (this.b) {
            f();
            size = this.c.size();
        }
        return size;
    }

    public final Intent b(int i) {
        synchronized (this.b) {
            if (this.g == null) {
                return null;
            }
            f();
            jv jvVar = (jv) this.c.get(i);
            ComponentName componentName = new ComponentName(jvVar.a.activityInfo.packageName, jvVar.a.activityInfo.name);
            Intent intent = new Intent(this.g);
            intent.setComponent(componentName);
            if (this.j != null) {
                new Intent(intent);
                this.j.a();
            }
            g(new jw(componentName, System.currentTimeMillis(), 1.0f));
            return intent;
        }
    }

    public final ResolveInfo c(int i) {
        ResolveInfo resolveInfo;
        synchronized (this.b) {
            f();
            resolveInfo = ((jv) this.c.get(i)).a;
        }
        return resolveInfo;
    }

    public final ResolveInfo d() {
        synchronized (this.b) {
            f();
            if (!this.c.isEmpty()) {
                return ((jv) this.c.get(0)).a;
            }
            return null;
        }
    }

    public final void f() {
        boolean z;
        boolean z2 = true;
        if (this.i && this.g != null) {
            this.i = false;
            this.c.clear();
            List<ResolveInfo> queryIntentActivities = this.e.getPackageManager().queryIntentActivities(this.g, 0);
            int size = queryIntentActivities.size();
            for (int i = 0; i < size; i++) {
                this.c.add(new jv(queryIntentActivities.get(i)));
            }
            z = true;
        } else {
            z = false;
        }
        if (this.h && this.o && !TextUtils.isEmpty(this.f)) {
            this.h = false;
            this.n = true;
            i();
        } else {
            z2 = false;
        }
        boolean z3 = z | z2;
        h();
        if (z3) {
            j();
            notifyChanged();
        }
    }

    public final void g(jw jwVar) {
        if (this.d.add(jwVar)) {
            this.o = true;
            h();
            if (this.n) {
                if (this.o) {
                    this.o = false;
                    if (!TextUtils.isEmpty(this.f)) {
                        new jy(this).executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new ArrayList(this.d), this.f);
                    }
                }
                j();
                notifyChanged();
                return;
            }
            throw new IllegalStateException("No preceding call to #readHistoricalData");
        }
    }
}
