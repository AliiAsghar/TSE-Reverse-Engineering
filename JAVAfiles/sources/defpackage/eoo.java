package defpackage;

import android.app.Application;
import android.os.Bundle;
import java.lang.reflect.Constructor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eoo extends eox implements eov {
    private Application a;
    private final eov b;
    private Bundle c;
    private enh d;
    private iba e;

    public eoo() {
        this.b = new eou();
    }

    @Override // defpackage.eov
    public final eor a(Class cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return e(canonicalName, cls);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @Override // defpackage.eov
    public final eor b(Class cls, epd epdVar) {
        Constructor b;
        String str = (String) epdVar.a(eow.d);
        if (str != null) {
            if (epdVar.a(eol.a) != null && epdVar.a(eol.b) != null) {
                Application application = (Application) epdVar.a(eou.b);
                boolean isAssignableFrom = emt.class.isAssignableFrom(cls);
                if (isAssignableFrom && application != null) {
                    b = eop.b(cls, eop.a);
                } else {
                    b = eop.b(cls, eop.b);
                }
                if (b == null) {
                    return this.b.b(cls, epdVar);
                }
                if (isAssignableFrom && application != null) {
                    return eop.a(cls, b, application, eol.a(epdVar));
                }
                return eop.a(cls, b, eol.a(epdVar));
            }
            if (this.d != null) {
                return e(str, cls);
            }
            throw new IllegalStateException("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
        }
        throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
    }

    @Override // defpackage.eov
    public final /* synthetic */ eor c(artf artfVar, epd epdVar) {
        return dyx.e(this, artfVar, epdVar);
    }

    @Override // defpackage.eox
    public final void d(eor eorVar) {
        enh enhVar = this.d;
        if (enhVar != null) {
            iba ibaVar = this.e;
            ibaVar.getClass();
            dyv.s(eorVar, ibaVar, enhVar);
        }
    }

    public final eor e(String str, Class cls) {
        Constructor b;
        eor a;
        Application application;
        enh enhVar = this.d;
        if (enhVar != null) {
            boolean isAssignableFrom = emt.class.isAssignableFrom(cls);
            if (isAssignableFrom && this.a != null) {
                b = eop.b(cls, eop.a);
            } else {
                b = eop.b(cls, eop.b);
            }
            if (b == null) {
                if (this.a != null) {
                    return this.b.a(cls);
                }
                if (eow.c == null) {
                    eow.c = new eow();
                }
                eow.c.getClass();
                return dza.c(cls);
            }
            iba ibaVar = this.e;
            ibaVar.getClass();
            eoi r = dyv.r(ibaVar, enhVar, str, this.c);
            if (isAssignableFrom && (application = this.a) != null) {
                a = eop.a(cls, b, application, r.a);
            } else {
                a = eop.a(cls, b, r.a);
            }
            a.l("androidx.lifecycle.savedstate.vm.tag", r);
            return a;
        }
        throw new UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
    }

    public eoo(Application application, gjz gjzVar, Bundle bundle) {
        eou eouVar;
        this.e = gjzVar.aK();
        this.d = gjzVar.N();
        this.c = bundle;
        this.a = application;
        if (application != null) {
            if (eou.a == null) {
                eou.a = new eou(application);
            }
            eouVar = eou.a;
            eouVar.getClass();
        } else {
            eouVar = new eou();
        }
        this.b = eouVar;
    }
}
