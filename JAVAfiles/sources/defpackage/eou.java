package defpackage;

import android.app.Application;
import java.lang.reflect.InvocationTargetException;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eou extends eow {
    public static eou a;
    public static final epc b = new eok();
    private final Application e;

    public eou(Application application) {
        this.e = application;
    }

    private static final eor d(Class cls, Application application) {
        if (emt.class.isAssignableFrom(cls)) {
            try {
                eor eorVar = (eor) cls.getConstructor(Application.class).newInstance(application);
                eorVar.getClass();
                return eorVar;
            } catch (IllegalAccessException e) {
                Objects.toString(cls);
                throw new RuntimeException("Cannot create an instance of ".concat(cls.toString()), e);
            } catch (InstantiationException e2) {
                Objects.toString(cls);
                throw new RuntimeException("Cannot create an instance of ".concat(cls.toString()), e2);
            } catch (NoSuchMethodException e3) {
                Objects.toString(cls);
                throw new RuntimeException("Cannot create an instance of ".concat(cls.toString()), e3);
            } catch (InvocationTargetException e4) {
                Objects.toString(cls);
                throw new RuntimeException("Cannot create an instance of ".concat(cls.toString()), e4);
            }
        }
        return dza.c(cls);
    }

    @Override // defpackage.eow, defpackage.eov
    public final eor a(Class cls) {
        Application application = this.e;
        if (application != null) {
            return d(cls, application);
        }
        throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
    }

    @Override // defpackage.eow, defpackage.eov
    public final eor b(Class cls, epd epdVar) {
        if (this.e != null) {
            return a(cls);
        }
        Application application = (Application) epdVar.a(b);
        if (application != null) {
            return d(cls, application);
        }
        if (!emt.class.isAssignableFrom(cls)) {
            return dza.c(cls);
        }
        throw new IllegalArgumentException("CreationExtras must have an application by `APPLICATION_KEY`");
    }

    public eou() {
        this(null);
    }
}
