package defpackage;

import android.os.Bundle;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class eol {
    public static final epc a = new eok();
    public static final epc b = new eok();
    public static final epc c = new eok();

    public static final eog a(epd epdVar) {
        eom eomVar;
        Bundle bundle;
        gjz gjzVar = (gjz) epdVar.a(a);
        if (gjzVar != null) {
            eoz eozVar = (eoz) epdVar.a(b);
            if (eozVar != null) {
                Bundle bundle2 = (Bundle) epdVar.a(c);
                String str = (String) epdVar.a(eow.d);
                if (str != null) {
                    gjy f = gjzVar.aK().f();
                    if (f instanceof eom) {
                        eomVar = (eom) f;
                    } else {
                        eomVar = null;
                    }
                    if (eomVar != null) {
                        eon b2 = b(eozVar);
                        eog eogVar = (eog) b2.a.get(str);
                        if (eogVar == null) {
                            List list = eog.a;
                            eomVar.b();
                            Bundle bundle3 = eomVar.a;
                            if (bundle3 != null) {
                                bundle = bundle3.getBundle(str);
                            } else {
                                bundle = null;
                            }
                            Bundle bundle4 = eomVar.a;
                            if (bundle4 != null) {
                                bundle4.remove(str);
                            }
                            Bundle bundle5 = eomVar.a;
                            if (bundle5 != null && bundle5.isEmpty()) {
                                eomVar.a = null;
                            }
                            eog b3 = eob.b(bundle, bundle2);
                            b2.a.put(str, b3);
                            return b3;
                        }
                        return eogVar;
                    }
                    throw new IllegalStateException("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
                }
                throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_KEY`");
            }
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
        }
        throw new IllegalArgumentException("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
    }

    public static final eon b(eoz eozVar) {
        return (eon) new eoy(eozVar, new eoj()).c("androidx.lifecycle.internal.SavedStateHandlesVM", eon.class);
    }

    public static final void c(gjz gjzVar) {
        eng a2 = gjzVar.N().a();
        if (a2 != eng.INITIALIZED && a2 != eng.CREATED) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (gjzVar.aK().f() == null) {
            eom eomVar = new eom(gjzVar.aK(), (eoz) gjzVar);
            gjzVar.aK().c("androidx.lifecycle.internal.SavedStateHandlesProvider", eomVar);
            gjzVar.N().c(new eoh(eomVar, 0));
        }
    }
}
