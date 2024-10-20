package defpackage;

import com.google.android.ims.provisioning.config.Configuration;
import com.google.android.ims.rcs.engine.impl.RcsEngineImpl;
import java.util.HashMap;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class addh implements Supplier {
    private final /* synthetic */ int a;

    public /* synthetic */ addh(int i) {
        this.a = i;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        switch (this.a) {
            case 0:
                return new IllegalStateException("No Messageid given in the instant message");
            case 1:
                return new IllegalArgumentException("No Content-Type given!");
            case 2:
                return new IllegalArgumentException("CPIM message has no from header assigned!");
            case 3:
                return new HashMap();
            case 4:
                int i = adnc.a;
                return apkn.RCS_PROVISIONING_UNKNOWN_STATE;
            case 5:
                int i2 = adnc.a;
                return apkn.RCS_PROVISIONING_UNKNOWN_STATE;
            case 6:
                int i3 = adnc.a;
                return apkn.RCS_PROVISIONING_UNKNOWN_STATE;
            case 7:
                int i4 = adnc.a;
                return apkn.RCS_PROVISIONING_UNKNOWN_STATE;
            case 8:
                return new Configuration();
            case 9:
                return new Configuration();
            case 10:
                return RcsEngineImpl.lambda$onImsModuleStarted$0();
            case 11:
                return new aiip("Can't create msrp manager: no local ip address");
            case 12:
                return new UnsupportedOperationException("Include :module_with_in_app_camera to use mini camera.");
            case 13:
                return null;
            case 14:
                return a.by();
            case 15:
                return a.by();
            case 16:
                return a.by();
            case 17:
                return a.by();
            case 18:
                return a.by();
            case 19:
                return a.by();
            default:
                return a.by();
        }
    }
}
