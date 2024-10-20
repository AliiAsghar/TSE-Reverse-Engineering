package defpackage;

import android.os.Bundle;
import java.lang.reflect.Constructor;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gjw implements enk {
    private final gjz a;

    public gjw(gjz gjzVar) {
        this.a = gjzVar;
    }

    @Override // defpackage.enk
    public final void dH(enm enmVar, enf enfVar) {
        ArrayList<String> stringArrayList;
        if (enfVar == enf.ON_CREATE) {
            enmVar.N().d(this);
            Bundle b = this.a.aK().b("androidx.savedstate.Restarter");
            if (b != null) {
                if (b.containsKey("classes_to_restore") && (stringArrayList = b.getStringArrayList("classes_to_restore")) != null) {
                    for (String str : stringArrayList) {
                        try {
                            Class<? extends U> asSubclass = Class.forName(str, false, gjw.class.getClassLoader()).asSubclass(gjx.class);
                            asSubclass.getClass();
                            try {
                                Constructor declaredConstructor = asSubclass.getDeclaredConstructor(null);
                                declaredConstructor.setAccessible(true);
                                try {
                                    Object newInstance = declaredConstructor.newInstance(null);
                                    newInstance.getClass();
                                    ((gjx) newInstance).a(this.a);
                                } catch (Exception e) {
                                    throw new RuntimeException("Failed to instantiate ".concat(String.valueOf(str)), e);
                                }
                            } catch (NoSuchMethodException e2) {
                                throw new IllegalStateException("Class " + asSubclass.getSimpleName() + " must have default constructor in order to be automatically recreated", e2);
                            }
                        } catch (ClassNotFoundException e3) {
                            throw new RuntimeException(a.bW(str, "Class ", " wasn't found"), e3);
                        }
                    }
                    return;
                }
                throw new IllegalStateException("SavedState with restored state for the component \"androidx.savedstate.Restarter\" must contain list of strings by the key \"classes_to_restore\"");
            }
            return;
        }
        throw new AssertionError("Next event must be ON_CREATE");
    }
}
