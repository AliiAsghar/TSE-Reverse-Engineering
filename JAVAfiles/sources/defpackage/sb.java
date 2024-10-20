package defpackage;

import android.app.ActivityOptions;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class sb {
    final /* synthetic */ re g;
    public final Map a = new LinkedHashMap();
    public final Map b = new LinkedHashMap();
    private final Map h = new LinkedHashMap();
    public final List c = new ArrayList();
    public final transient Map d = new LinkedHashMap();
    public final Map e = new LinkedHashMap();
    public final Bundle f = new Bundle();

    public sb(re reVar) {
        this.g = reVar;
    }

    private final void g(String str) {
        if (((Integer) this.b.get(str)) == null) {
            Iterator a = arrn.d(ry.a).a();
            while (a.hasNext()) {
                Number number = (Number) a.next();
                if (!this.a.containsKey(Integer.valueOf(number.intValue()))) {
                    c(number.intValue(), str);
                    return;
                }
            }
            throw new NoSuchElementException("Sequence contains no element matching the predicate.");
        }
    }

    public final rw a(String str, se seVar, rv rvVar) {
        str.getClass();
        seVar.getClass();
        g(str);
        this.d.put(str, new fvq(rvVar, seVar, (char[]) null));
        if (this.e.containsKey(str)) {
            Object obj = this.e.get(str);
            this.e.remove(str);
            rvVar.a(obj);
        }
        ru ruVar = (ru) ef.b(this.f, str, ru.class);
        if (ruVar != null) {
            this.f.remove(str);
            rvVar.a(seVar.b(ruVar.a, ruVar.b));
        }
        return new sa(this, str, seVar);
    }

    /* JADX WARN: Type inference failed for: r7v3, types: [java.util.List, java.lang.Object] */
    public final rw b(final String str, enm enmVar, final se seVar, final rv rvVar) {
        enh N = enmVar.N();
        if (!N.a().a(eng.STARTED)) {
            g(str);
            fdx fdxVar = (fdx) this.h.get(str);
            if (fdxVar == null) {
                fdxVar = new fdx(N);
            }
            enk enkVar = new enk() { // from class: rx
                @Override // defpackage.enk
                public final void dH(enm enmVar2, enf enfVar) {
                    sb sbVar = sb.this;
                    String str2 = str;
                    if (enf.ON_START == enfVar) {
                        se seVar2 = seVar;
                        rv rvVar2 = rvVar;
                        sbVar.d.put(str2, new fvq(rvVar2, seVar2, (char[]) null));
                        if (sbVar.e.containsKey(str2)) {
                            Object obj = sbVar.e.get(str2);
                            sbVar.e.remove(str2);
                            rvVar2.a(obj);
                        }
                        ru ruVar = (ru) ef.b(sbVar.f, str2, ru.class);
                        if (ruVar != null) {
                            sbVar.f.remove(str2);
                            rvVar2.a(seVar2.b(ruVar.a, ruVar.b));
                            return;
                        }
                        return;
                    }
                    if (enf.ON_STOP == enfVar) {
                        sbVar.d.remove(str2);
                    } else if (enf.ON_DESTROY == enfVar) {
                        sbVar.d(str2);
                    }
                }
            };
            ((enh) fdxVar.b).c(enkVar);
            fdxVar.a.add(enkVar);
            this.h.put(str, fdxVar);
            return new rz(this, str, seVar);
        }
        throw new IllegalStateException("LifecycleOwner " + enmVar + " is attempting to register while current state is " + N.a() + ". LifecycleOwners must call register before they are STARTED.");
    }

    public final void c(int i, String str) {
        Map map = this.a;
        Integer valueOf = Integer.valueOf(i);
        map.put(valueOf, str);
        this.b.put(str, valueOf);
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.lang.Iterable] */
    public final void d(String str) {
        Integer num;
        if (!this.c.contains(str) && (num = (Integer) this.b.remove(str)) != null) {
            this.a.remove(num);
        }
        this.d.remove(str);
        if (this.e.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + this.e.get(str));
            this.e.remove(str);
        }
        if (this.f.containsKey(str)) {
            Log.w("ActivityResultRegistry", "Dropping pending result for request " + str + ": " + ((ru) ef.b(this.f, str, ru.class)));
            this.f.remove(str);
        }
        fdx fdxVar = (fdx) this.h.get(str);
        if (fdxVar != null) {
            Iterator it = fdxVar.a.iterator();
            while (it.hasNext()) {
                ((enh) fdxVar.b).d((enk) it.next());
            }
            fdxVar.a.clear();
            this.h.remove(str);
        }
    }

    /* JADX WARN: Type inference failed for: r1v5, types: [rv, java.lang.Object] */
    public final boolean e(int i, int i2, Intent intent) {
        Object obj;
        String str = (String) this.a.get(Integer.valueOf(i));
        if (str == null) {
            return false;
        }
        fvq fvqVar = (fvq) this.d.get(str);
        if (fvqVar != null) {
            obj = fvqVar.a;
        } else {
            obj = null;
        }
        if (obj != null && this.c.contains(str)) {
            fvqVar.a.a(((se) fvqVar.b).b(i2, intent));
            this.c.remove(str);
            return true;
        }
        this.e.remove(str);
        this.f.putParcelable(str, new ru(i2, intent));
        return true;
    }

    public final void f(int i, se seVar, Object obj, efu efuVar) {
        Bundle bundle;
        Bundle bundle2;
        String[] strArr;
        re reVar = this.g;
        efu c = seVar.c(reVar, obj);
        if (c != null) {
            new Handler(Looper.getMainLooper()).post(new qq(this, i, c, 2, (byte[]) null));
            return;
        }
        Intent a = seVar.a(reVar, obj);
        if (a.getExtras() != null) {
            Bundle extras = a.getExtras();
            extras.getClass();
            if (extras.getClassLoader() == null) {
                a.setExtrasClassLoader(reVar.getClassLoader());
            }
        }
        if (a.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
            Bundle bundleExtra = a.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            a.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            bundle2 = bundleExtra;
        } else {
            if (efuVar != null) {
                bundle = ((ActivityOptions) efuVar.a).toBundle();
            } else {
                bundle = null;
            }
            bundle2 = bundle;
        }
        if (d.F("androidx.activity.result.contract.action.REQUEST_PERMISSIONS", a.getAction())) {
            String[] stringArrayExtra = a.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
            if (stringArrayExtra == null) {
                stringArrayExtra = new String[0];
            }
            HashSet hashSet = new HashSet();
            int i2 = 0;
            while (true) {
                int length = stringArrayExtra.length;
                if (i2 < length) {
                    if (!TextUtils.isEmpty(stringArrayExtra[i2])) {
                        if (Build.VERSION.SDK_INT < 33 && TextUtils.equals(stringArrayExtra[i2], "android.permission.POST_NOTIFICATIONS")) {
                            hashSet.add(Integer.valueOf(i2));
                        }
                        i2++;
                    } else {
                        throw new IllegalArgumentException("Permission request for permissions " + Arrays.toString(stringArrayExtra) + " must not contain null or empty values");
                    }
                } else {
                    int size = hashSet.size();
                    if (size > 0) {
                        strArr = new String[length - size];
                    } else {
                        strArr = stringArrayExtra;
                    }
                    if (size > 0) {
                        if (size != length) {
                            int i3 = 0;
                            for (int i4 = 0; i4 < stringArrayExtra.length; i4++) {
                                if (!hashSet.contains(Integer.valueOf(i4))) {
                                    strArr[i3] = stringArrayExtra[i4];
                                    i3++;
                                }
                            }
                        } else {
                            return;
                        }
                    }
                    if (reVar instanceof cj) {
                    }
                    reVar.requestPermissions(stringArrayExtra, i);
                    return;
                }
            }
        } else {
            if (d.F("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST", a.getAction())) {
                sd sdVar = (sd) a.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
                try {
                    sdVar.getClass();
                    reVar.startIntentSenderForResult(sdVar.a, i, sdVar.b, sdVar.c, sdVar.d, 0, bundle2);
                    return;
                } catch (IntentSender.SendIntentException e) {
                    new Handler(Looper.getMainLooper()).post(new qq(this, i, e, 3));
                    return;
                }
            }
            reVar.startActivityForResult(a, i, bundle2);
        }
    }

    public sb() {
    }
}
