package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.IBinder;
import com.google.android.libraries.inputmethod.preferences.ICrossProcessPreferenceClient;
import com.google.android.libraries.inputmethod.preferences.ICrossProcessPreferenceServer;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class ahaf implements SharedPreferences {
    public static final alvi a = alvi.m("com/google/android/libraries/inputmethod/preferences/CrossProcessSharedPreferences");
    public final ahae b;
    public ICrossProcessPreferenceServer e;
    private final Context f;
    private final String g;
    private final ICrossProcessPreferenceClient h;
    public final Map c = new HashMap();
    public final Set d = new HashSet();
    private final IBinder.DeathRecipient i = new acrn(this, 1);

    public ahaf(Context context) {
        this.f = context;
        int i = ahbn.a;
        String concat = String.valueOf(context.getPackageName()).concat(".wdb");
        this.g = concat;
        this.b = new ahae(context, concat);
        this.h = new ahad(this);
    }

    public static ahbq a(Context context, String str, ahbo ahboVar) {
        int aJ;
        try {
            ahbq a2 = ahbw.a(ahbw.b(context, str, ahboVar));
            if (a2 != null && (aJ = ahji.aJ(a2.b)) != 0 && aJ == 201) {
                return a2;
            }
            ((alvg) ((alvg) a.i()).h("com/google/android/libraries/inputmethod/preferences/CrossProcessSharedPreferences", "sendRequest", 336, "CrossProcessSharedPreferences.java")).q("The response of the request is invalid");
            return null;
        } catch (Exception e) {
            ((alvg) ((alvg) ((alvg) a.i()).g(e)).h("com/google/android/libraries/inputmethod/preferences/CrossProcessSharedPreferences", "sendRequest", (char) 329, "CrossProcessSharedPreferences.java")).q("Fail to send WDB request");
            return null;
        }
    }

    private final Object e(String str, Class cls, Object obj) {
        Object obj2;
        synchronized (this) {
            obj2 = this.c.get(str);
        }
        if (cls.isInstance(obj2)) {
            return cls.cast(obj2);
        }
        return obj;
    }

    private final synchronized boolean f(IBinder iBinder) {
        ICrossProcessPreferenceServer asInterface = ICrossProcessPreferenceServer.Stub.asInterface(iBinder);
        try {
            if (!asInterface.register(this.h)) {
                ((alvg) ((alvg) a.i()).h("com/google/android/libraries/inputmethod/preferences/CrossProcessSharedPreferences", "connectServer", 250, "CrossProcessSharedPreferences.java")).q("Failed to register to the server.");
                return false;
            }
            this.e = asInterface;
            try {
                iBinder.linkToDeath(this.i, 0);
            } catch (Exception e) {
                ((alvg) ((alvg) ((alvg) a.i()).g(e)).h("com/google/android/libraries/inputmethod/preferences/CrossProcessSharedPreferences", "connectServer", (char) 263, "CrossProcessSharedPreferences.java")).q("Failed to add deathRecipient.");
            }
            return true;
        } catch (Exception e2) {
            ((alvg) ((alvg) ((alvg) a.i()).g(e2)).h("com/google/android/libraries/inputmethod/preferences/CrossProcessSharedPreferences", "connectServer", (char) 254, "CrossProcessSharedPreferences.java")).q("Failed to register to the server.");
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void b() {
        ICrossProcessPreferenceServer iCrossProcessPreferenceServer = this.e;
        if (iCrossProcessPreferenceServer == null) {
            return;
        }
        try {
            try {
                iCrossProcessPreferenceServer.unregister(this.h);
            } finally {
                this.e = null;
            }
        } catch (Exception e) {
            ((alvg) ((alvg) ((alvg) a.i()).g(e)).h("com/google/android/libraries/inputmethod/preferences/CrossProcessSharedPreferences", "disconnectServer", (char) 277, "CrossProcessSharedPreferences.java")).q("Failed to unregister from the server.");
        }
        try {
            iCrossProcessPreferenceServer.asBinder().unlinkToDeath(this.i, 0);
        } catch (RuntimeException e2) {
            ((alvg) ((alvg) ((alvg) a.i()).g(e2)).h("com/google/android/libraries/inputmethod/preferences/CrossProcessSharedPreferences", "disconnectServer", (char) 286, "CrossProcessSharedPreferences.java")).q("Failed to remove death recipient.");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    public final void c() {
        Bundle bundle;
        int aJ;
        apae checkIsLite;
        Object c;
        synchronized (this) {
            if (this.e != null) {
                return;
            }
            alok alokVar = new alok();
            IBinder iBinder = null;
            try {
                Context context = this.f;
                String str = this.g;
                apaa apaaVar = (apaa) ahbo.a.createBuilder();
                long millis = agsp.a.d().toMillis();
                if (!apaaVar.b.isMutable()) {
                    apaaVar.u();
                }
                ahbo ahboVar = (ahbo) apaaVar.b;
                ahboVar.b |= 1;
                ahboVar.c = millis;
                apae apaeVar = ahbu.b;
                aozy createBuilder = ahbu.a.createBuilder();
                ahbr ahbrVar = ahbr.a;
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                ahbu ahbuVar = (ahbu) createBuilder.b;
                ahbrVar.getClass();
                ahbuVar.d = ahbrVar;
                ahbuVar.c = 2;
                apaaVar.ct(apaeVar, (ahbu) createBuilder.s());
                bundle = ahbw.b(context, str, (ahbo) apaaVar.s());
            } catch (Exception e) {
                ((alvg) ((alvg) ((alvg) a.i()).g(e)).h("com/google/android/libraries/inputmethod/preferences/CrossProcessSharedPreferences", "fetchAllPreferences", (char) 212, "CrossProcessSharedPreferences.java")).q("Failed to send FETCH_PREFERENCES request");
                bundle = null;
            }
            if (bundle == null) {
                ((alvg) ((alvg) a.i()).h("com/google/android/libraries/inputmethod/preferences/CrossProcessSharedPreferences", "fetchAllPreferences", 215, "CrossProcessSharedPreferences.java")).q("The result bundle of FETCH_PREFERENCES is null.");
            } else {
                IBinder binder = bundle.getBinder("binder");
                if (binder == null) {
                    ((alvg) ((alvg) a.i()).h("com/google/android/libraries/inputmethod/preferences/CrossProcessSharedPreferences", "fetchAllPreferences", 222, "CrossProcessSharedPreferences.java")).q("The result bundle doesn't contain a binder");
                } else {
                    ahbq a2 = ahbw.a(bundle);
                    if (a2 != null && (aJ = ahji.aJ(a2.b)) != 0 && aJ == 201) {
                        checkIsLite = apag.checkIsLite(ahbv.b);
                        a2.b(checkIsLite);
                        Object l = a2.l.l(checkIsLite.d);
                        if (l == null) {
                            c = checkIsLite.b;
                        } else {
                            c = checkIsLite.c(l);
                        }
                        ahac ahacVar = ((ahbv) c).c;
                        if (ahacVar == null) {
                            ahacVar = ahac.a;
                        }
                        for (ahai ahaiVar : ahacVar.b) {
                            alokVar.h(ahaiVar.e, ahan.f(ahaiVar));
                        }
                        iBinder = binder;
                    }
                    ((alvg) ((alvg) a.i()).h("com/google/android/libraries/inputmethod/preferences/CrossProcessSharedPreferences", "fetchAllPreferences", 229, "CrossProcessSharedPreferences.java")).q("The response of FETCH_PREFERENCES request is null.");
                }
            }
            if (iBinder == null) {
                return;
            }
            if (!f(iBinder)) {
                return;
            }
            alor g = alokVar.g();
            alor j = alor.j(this.c);
            this.c.clear();
            this.c.putAll(g);
            alpt o = alpt.o(this.d);
            alpr alprVar = new alpr();
            Set[] setArr = {j.keySet(), g.keySet()};
            alpr alprVar2 = new alpr();
            for (int i = 0; i < 2; i++) {
                alprVar2.j(setArr[i]);
            }
            aluq listIterator = alprVar2.g().listIterator();
            while (listIterator.hasNext()) {
                String str2 = (String) listIterator.next();
                Object obj = g.get(str2);
                if (obj == null || !obj.equals(j.get(str2))) {
                    alprVar.c(str2);
                }
            }
            d(o, alprVar.g());
        }
    }

    @Override // android.content.SharedPreferences
    public final synchronized boolean contains(String str) {
        return this.c.containsKey(str);
    }

    public final void d(Set set, Set set2) {
        Iterator it = set2.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            Iterator it2 = set.iterator();
            while (it2.hasNext()) {
                ((SharedPreferences.OnSharedPreferenceChangeListener) it2.next()).onSharedPreferenceChanged(this, str);
            }
        }
    }

    @Override // android.content.SharedPreferences
    public final /* synthetic */ SharedPreferences.Editor edit() {
        return this.b;
    }

    @Override // android.content.SharedPreferences
    public final synchronized Map getAll() {
        return this.c;
    }

    @Override // android.content.SharedPreferences
    public final boolean getBoolean(String str, boolean z) {
        return ((Boolean) e(str, Boolean.class, Boolean.valueOf(z))).booleanValue();
    }

    @Override // android.content.SharedPreferences
    public final float getFloat(String str, float f) {
        return ((Float) e(str, Float.class, Float.valueOf(f))).floatValue();
    }

    @Override // android.content.SharedPreferences
    public final int getInt(String str, int i) {
        return ((Integer) e(str, Integer.class, Integer.valueOf(i))).intValue();
    }

    @Override // android.content.SharedPreferences
    public final long getLong(String str, long j) {
        return ((Long) e(str, Long.class, Long.valueOf(j))).longValue();
    }

    @Override // android.content.SharedPreferences
    public final String getString(String str, String str2) {
        return (String) e(str, String.class, str2);
    }

    @Override // android.content.SharedPreferences
    public final Set getStringSet(String str, Set set) {
        return (Set) e(str, Set.class, set);
    }

    @Override // android.content.SharedPreferences
    public final synchronized void registerOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.d.add(onSharedPreferenceChangeListener);
    }

    @Override // android.content.SharedPreferences
    public final synchronized void unregisterOnSharedPreferenceChangeListener(SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener) {
        this.d.remove(onSharedPreferenceChangeListener);
    }
}
