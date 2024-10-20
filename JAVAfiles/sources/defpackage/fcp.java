package defpackage;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.net.Uri;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class fcp {
    public static int c;
    public final Object a;
    public Object b;

    public fcp(Object obj) {
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.util.Map, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.util.Map, java.lang.Object] */
    public final synchronized Map a() {
        if (this.b == null) {
            this.b = DesugarCollections.unmodifiableMap(new HashMap((Map) this.a));
        }
        return this.b;
    }

    public final void b(elg elgVar, int i, int i2) {
        fcp c2 = c(elgVar.a(i));
        if (c2 == null) {
            c2 = new fcp(1);
            ((SparseArray) this.a).put(elgVar.a(i), c2);
        }
        if (i2 > i) {
            c2.b(elgVar, i + 1, i2);
        } else {
            c2.b = elgVar;
        }
    }

    public final fcp c(int i) {
        return (fcp) ((SparseArray) this.a).get(i);
    }

    public final void d(ejy ejyVar, int i, int i2) {
        fcp l = l(ejyVar.a(i));
        if (l == null) {
            l = new fcp(1, (byte[]) null);
            ((SparseArray) this.a).put(ejyVar.a(i), l);
        }
        if (i2 > i) {
            l.d(ejyVar, i + 1, i2);
        } else {
            l.b = ejyVar;
        }
    }

    public final Intent e() {
        Object obj = this.b;
        if (obj != null && ((ArrayList) obj).size() > 1) {
            ((Intent) this.a).setAction("android.intent.action.SEND_MULTIPLE");
            ((Intent) this.a).putParcelableArrayListExtra("android.intent.extra.STREAM", (ArrayList) this.b);
            dyg.b((Intent) this.a, (ArrayList) this.b);
        } else {
            ((Intent) this.a).setAction("android.intent.action.SEND");
            Object obj2 = this.b;
            if (obj2 != null && !((ArrayList) obj2).isEmpty()) {
                ((Intent) this.a).putExtra("android.intent.extra.STREAM", (Parcelable) ((ArrayList) this.b).get(0));
                dyg.b((Intent) this.a, (ArrayList) this.b);
            } else {
                ((Intent) this.a).removeExtra("android.intent.extra.STREAM");
                ((Intent) this.a).setClipData(null);
                Intent intent = (Intent) this.a;
                intent.setFlags(intent.getFlags() & (-2));
            }
        }
        return (Intent) this.a;
    }

    public final void f(Uri uri) {
        this.b = null;
        if (uri != null) {
            this.b = new ArrayList();
            ((ArrayList) this.b).add(uri);
        }
    }

    public final void g(CharSequence charSequence) {
        ((Intent) this.a).putExtra("android.intent.extra.TEXT", charSequence);
    }

    public final void h(String str) {
        ((Intent) this.a).setType(str);
    }

    public final long i(dwq dwqVar, long j) {
        dwy dwyVar = dwqVar.d;
        if (dwyVar instanceof dwu) {
            return j;
        }
        int size = dwqVar.j.size();
        long j2 = j;
        for (int i = 0; i < size; i++) {
            dwo dwoVar = (dwo) dwqVar.j.get(i);
            if (dwoVar instanceof dwq) {
                dwq dwqVar2 = (dwq) dwoVar;
                if (dwqVar2.d != dwyVar) {
                    j2 = Math.min(j2, i(dwqVar2, dwqVar2.e + j));
                }
            }
        }
        if (dwqVar == dwyVar.i) {
            long a = j - dwyVar.a();
            return Math.min(Math.min(j2, i(dwyVar.h, a)), a - dwyVar.h.e);
        }
        return j2;
    }

    public final long j(dwq dwqVar, long j) {
        dwy dwyVar = dwqVar.d;
        if (dwyVar instanceof dwu) {
            return j;
        }
        int size = dwqVar.j.size();
        long j2 = j;
        for (int i = 0; i < size; i++) {
            dwo dwoVar = (dwo) dwqVar.j.get(i);
            if (dwoVar instanceof dwq) {
                dwq dwqVar2 = (dwq) dwoVar;
                if (dwqVar2.d != dwyVar) {
                    j2 = Math.max(j2, j(dwqVar2, dwqVar2.e + j));
                }
            }
        }
        if (dwqVar == dwyVar.h) {
            long a = j + dwyVar.a();
            return Math.max(Math.max(j2, j(dwyVar.i, a)), a - dwyVar.i.e);
        }
        return j2;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [android.view.textclassifier.TextClassifier, java.lang.Object] */
    public final TextClassifier k() {
        TextClassifier textClassifier;
        TextClassifier textClassifier2;
        ?? r0 = this.b;
        if (r0 == 0) {
            TextClassificationManager m375m = ex$$ExternalSyntheticApiModelOutline1.m375m(((TextView) this.a).getContext().getSystemService(ex$$ExternalSyntheticApiModelOutline1.m378m()));
            if (m375m == null) {
                textClassifier = TextClassifier.NO_OP;
                return textClassifier;
            }
            textClassifier2 = m375m.getTextClassifier();
            return textClassifier2;
        }
        return r0;
    }

    public final fcp l(int i) {
        return (fcp) ((SparseArray) this.a).get(i);
    }

    public fcp(dwy dwyVar) {
        this.b = null;
        this.a = new ArrayList();
        c++;
        this.b = dwyVar;
    }

    public fcp(Context context, byte[] bArr) {
        Activity activity;
        dye.i(context);
        Intent action = new Intent().setAction("android.intent.action.SEND");
        this.a = action;
        action.putExtra("androidx.core.app.EXTRA_CALLING_PACKAGE", context.getPackageName());
        action.putExtra("android.support.v4.app.EXTRA_CALLING_PACKAGE", context.getPackageName());
        action.addFlags(524288);
        while (true) {
            if (!(context instanceof ContextWrapper)) {
                activity = null;
                break;
            } else {
                if (context instanceof Activity) {
                    activity = (Activity) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
        }
        if (activity != null) {
            ComponentName componentName = activity.getComponentName();
            ((Intent) this.a).putExtra("androidx.core.app.EXTRA_CALLING_ACTIVITY", componentName);
            ((Intent) this.a).putExtra("android.support.v4.app.EXTRA_CALLING_ACTIVITY", componentName);
        }
    }

    public fcp(int i, byte[] bArr) {
        this.a = new SparseArray(i);
    }

    public fcp(int i) {
        this.a = new SparseArray(i);
    }

    public fcp(byte[] bArr) {
        this.a = new HashMap();
    }

    public fcp() {
        this((Object) null);
    }
}
