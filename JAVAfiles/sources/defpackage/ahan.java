package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import defpackage.ahbg;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahan extends gfe implements aguc {
    public static final a a;
    public static final Object b;
    public static final Object c;
    public static final Map d;
    private static final alwo k = agyj.a;
    private static volatile ahan l;
    public final boolean e;
    public volatile ahah g;
    public final agrk j;
    private final tm m = new tm();
    private final SharedPreferences.OnSharedPreferenceChangeListener n = new ahaj(this, 0);
    public final AtomicBoolean f = new AtomicBoolean(true);
    private volatile alor o = altc.a;
    private volatile alor p = altc.a;
    private volatile alor q = altc.a;
    public volatile alor h = altc.a;
    public volatile alor i = altc.a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* compiled from: PG */
    /* loaded from: classes4.dex */
    public class a extends agzr {
    }

    static {
        a aVar = new a();
        a = aVar;
        b = new ahak();
        c = new ahal();
        agzt.c("Preferences_UserUnlocked", aVar);
        d = new tm();
    }

    public ahan(Context context, String str) {
        ahah ahahVar;
        boolean isEmpty = TextUtils.isEmpty(str);
        this.e = !isEmpty;
        this.j = new agrk(context.getResources());
        boolean a2 = ahbk.a(context);
        if (ahav.a && !a2) {
            if (isEmpty) {
                this.g = new ahag(context);
            } else {
                throw new IllegalStateException("Non-main process shouldn't access private preferences");
            }
        } else {
            if (!isEmpty) {
                if (ahbg.a()) {
                    ahahVar = new ahao(context.getApplicationContext(), str);
                } else {
                    throw new IllegalStateException("Private preferences should not be used before user unlocked");
                }
            } else {
                ahap ahapVar = new ahap(context.getApplicationContext());
                Context a3 = ahbn.a(ahapVar.a);
                Context context2 = ahapVar.a;
                if (a3 == context2) {
                    ahapVar.c(PreferenceManager.getDefaultSharedPreferences(context2), false);
                    ahapVar.b = true;
                } else {
                    SharedPreferences defaultSharedPreferences = PreferenceManager.getDefaultSharedPreferences(a3);
                    boolean z = defaultSharedPreferences.getBoolean("has_migrated_to_de_storage", false);
                    ahapVar.c(defaultSharedPreferences, true);
                    byte[] bArr = null;
                    adhc adhcVar = new adhc(ahapVar, new hwm(ahapVar, z, 13, bArr), 20, bArr);
                    ahbg.a aVar = ahbg.a;
                    agzt.a(aVar);
                    ahapVar.c = new agzs(adhcVar, aVar.getClass());
                    ahapVar.c.a(andi.a);
                }
                ahahVar = ahapVar;
            }
            this.g = ahahVar;
        }
        if (isEmpty) {
            agub.a.a(this);
        }
    }

    public static ahan d(Context context) {
        ahan ahanVar;
        ahan ahanVar2 = l;
        if (ahanVar2 != null) {
            return ahanVar2;
        }
        synchronized (ahan.class) {
            if (l == null) {
                l = new ahan(context.getApplicationContext(), null);
                l.g();
            }
            ahanVar = l;
        }
        return ahanVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Object f(ahai ahaiVar) {
        long j;
        float f;
        ahaq ahaqVar;
        String str;
        int i = ahaiVar.c;
        int aN = ahji.aN(i);
        if (aN != 0) {
            int i2 = aN - 1;
            boolean z = false;
            int i3 = 0;
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 != 2) {
                        if (i2 != 3) {
                            if (i2 != 4) {
                                if (i2 != 5) {
                                    switch (ahji.aN(i)) {
                                        case 1:
                                            str = "BOOL_VALUE";
                                            break;
                                        case 2:
                                            str = "INT_VALUE";
                                            break;
                                        case 3:
                                            str = "LONG_VALUE";
                                            break;
                                        case 4:
                                            str = "FLOAT_VALUE";
                                            break;
                                        case 5:
                                            str = "STRING_VALUE";
                                            break;
                                        case 6:
                                            str = "STRING_SET_VALUE";
                                            break;
                                        case 7:
                                            str = "VALUE_NOT_SET";
                                            break;
                                        default:
                                            str = "null";
                                            break;
                                    }
                                    throw new IllegalArgumentException("Unknown value type: ".concat(str));
                                }
                                if (i == 7) {
                                    ahaqVar = (ahaq) ahaiVar.d;
                                } else {
                                    ahaqVar = ahaq.a;
                                }
                                return alpt.o(ahaqVar.b);
                            }
                            if (i == 6) {
                                return (String) ahaiVar.d;
                            }
                            return "";
                        }
                        if (i == 5) {
                            f = ((Float) ahaiVar.d).floatValue();
                        } else {
                            f = brg.a;
                        }
                        return Float.valueOf(f);
                    }
                    if (i == 4) {
                        j = ((Long) ahaiVar.d).longValue();
                    } else {
                        j = 0;
                    }
                    return Long.valueOf(j);
                }
                if (i == 3) {
                    i3 = ((Integer) ahaiVar.d).intValue();
                }
                return Integer.valueOf(i3);
            }
            if (i == 2) {
                z = ((Boolean) ahaiVar.d).booleanValue();
            }
            return Boolean.valueOf(z);
        }
        throw null;
    }

    private final synchronized void p(aham ahamVar, String str) {
        if (!this.m.isEmpty()) {
            if (str.equals("")) {
                int i = 0;
                while (true) {
                    tm tmVar = this.m;
                    if (i >= tmVar.d) {
                        break;
                    }
                    String str2 = (String) tmVar.d(i);
                    if (!str2.equals("") && ((Set) this.m.g(i)).contains(ahamVar)) {
                        throw new alia(String.format("The listener is already registered for key: %s", str2));
                    }
                    i++;
                }
            } else {
                Set set = (Set) this.m.get("");
                if (set != null && set.contains(ahamVar)) {
                    throw new alia("The listener is already registered for all keys");
                }
            }
        }
    }

    private final synchronized void q(SharedPreferences sharedPreferences) {
        if (this.m.isEmpty()) {
            sharedPreferences.registerOnSharedPreferenceChangeListener(this.n);
        }
    }

    @Override // defpackage.gfe
    public final String a(int i) {
        return this.j.d(i);
    }

    @Override // defpackage.gfe
    public final void c(String str) {
        ((Float) e(str, Float.class, Float.valueOf(-1.0f), null)).floatValue();
    }

    /* JADX WARN: Type inference failed for: r0v13, types: [android.content.SharedPreferences, java.lang.Object] */
    public final Object e(String str, Class cls, Object obj, Object obj2) {
        Object obj3 = this.i.get(str);
        if (obj3 == c) {
            obj3 = this.q.get(str);
        } else if (obj3 == null && (obj3 = this.h.get(str)) == null) {
            obj3 = this.q.get(str);
        }
        if (obj3 != null && cls.isInstance(obj3)) {
            return cls.cast(obj3);
        }
        Object obj4 = this.p.get(str);
        if (obj4 == null) {
            obj4 = this.o.get(str);
        }
        if (obj4 instanceof alhr) {
            obj = ((alhr) obj4).get();
        } else if (obj4 != null) {
            obj = obj4;
        }
        if (obj3 != b) {
            try {
                ?? r0 = this.g.get();
                if (cls == Boolean.class) {
                    return cls.cast(Boolean.valueOf(r0.getBoolean(str, ((Boolean) obj).booleanValue())));
                }
                if (cls == Float.class) {
                    return cls.cast(Float.valueOf(r0.getFloat(str, ((Float) obj).floatValue())));
                }
                if (cls == Integer.class) {
                    return cls.cast(Integer.valueOf(r0.getInt(str, ((Integer) obj).intValue())));
                }
                if (cls == Long.class) {
                    return cls.cast(Long.valueOf(r0.getLong(str, ((Long) obj).longValue())));
                }
                if (cls == String.class) {
                    return cls.cast(r0.getString(str, (String) obj));
                }
                if (cls == Set.class) {
                    return cls.cast(r0.getStringSet(str, (Set) obj));
                }
                throw new IllegalArgumentException("Unsupported type ".concat(cls.toString()));
            } catch (ClassCastException e) {
                ((alwl) ((alwl) ((alwl) k.h()).g(e)).h("com/google/android/libraries/inputmethod/preferences/Preferences", "get", 932, "Preferences.java")).D("Preference %s is not %s", str, cls);
                if (obj2 != null) {
                    return obj2;
                }
            }
        }
        return obj;
    }

    public final void g() {
        this.g.b(new ahjj(this, (byte[]) null));
    }

    public final void h(String str, String str2) {
        aham[] ahamVarArr;
        synchronized (this) {
            Set set = (Set) this.m.get(str);
            if (set != null) {
                if (set.isEmpty()) {
                    this.m.remove(str);
                    return;
                }
                ahamVarArr = (aham[]) set.toArray(new aham[0]);
            } else {
                ahamVarArr = null;
            }
            if (ahamVarArr != null) {
                for (aham ahamVar : ahamVarArr) {
                    if (ahamVar != null) {
                        ahamVar.a(this, str2);
                    }
                }
            }
        }
    }

    public final void i(String str, String str2) {
        this.g.a().putString(str, str2).apply();
    }

    public final synchronized void j(aham ahamVar, int i) {
        k(ahamVar, this.j.d(i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [android.content.SharedPreferences, java.lang.Object] */
    public final synchronized void k(aham ahamVar, String str) {
        if (ahaw.a) {
            p(ahamVar, str);
        }
        q(this.g.get());
        Set set = (Set) this.m.get(str);
        if (set == null) {
            set = Collections.newSetFromMap(new WeakHashMap());
            this.m.put(str, set);
        }
        set.add(ahamVar);
    }

    public final synchronized void l(SharedPreferences sharedPreferences, SharedPreferences sharedPreferences2) {
        if (sharedPreferences != sharedPreferences2) {
            if (!this.m.isEmpty()) {
                sharedPreferences2.unregisterOnSharedPreferenceChangeListener(this.n);
                sharedPreferences.registerOnSharedPreferenceChangeListener(this.n);
            }
        }
    }

    public final boolean m(int i) {
        return n(a(i));
    }

    public final boolean n(String str) {
        return ((Boolean) e(str, Boolean.class, false, false)).booleanValue();
    }

    public final String o(String str) {
        return (String) e(str, String.class, "", null);
    }
}
