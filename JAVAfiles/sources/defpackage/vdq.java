package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.chromium.net.CronetEngine;
import org.chromium.net.CronetProvider;
import org.chromium.net.ExperimentalCronetEngine;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vdq implements aokt {
    public static final Map a = aqjn.m(new armo(CronetProvider.PROVIDER_NAME_APP_PACKAGED, 0), new armo("Google-Play-Services-Cronet-Provider", 1), new armo(CronetProvider.PROVIDER_NAME_FALLBACK, 2));
    private static final alvi b = alvi.m("com/google/android/apps/messaging/shared/net/cronet/CronetEngineBuilderFactory");
    private final Context c;

    public vdq(Context context) {
        context.getClass();
        this.c = context;
    }

    public final CronetProvider a() {
        Object obj;
        List<CronetProvider> allProviders = CronetProvider.getAllProviders(this.c);
        alvg alvgVar = (alvg) b.g().h("com/google/android/apps/messaging/shared/net/cronet/CronetEngineBuilderFactory", "selectProvider", 68, "CronetEngineBuilderFactory.kt");
        allProviders.getClass();
        alvgVar.t("Found Cronet providers: %s", aqjn.aK(allProviders, null, null, null, vnk.b, 31));
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : allProviders) {
            if (!d.F(((CronetProvider) obj2).getName(), CronetProvider.PROVIDER_NAME_APP_PACKAGED) || anfi.a("bugle.enable_embedded_cronet", "bugle")) {
                arrayList.add(obj2);
            }
        }
        Iterator it = aqjn.au(arrayList, new lvh(12)).iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((CronetProvider) obj).isEnabled()) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        CronetProvider cronetProvider = (CronetProvider) obj;
        if (cronetProvider != null) {
            ((alvg) b.g().h("com/google/android/apps/messaging/shared/net/cronet/CronetEngineBuilderFactory", "selectProvider", 86, "CronetEngineBuilderFactory.kt")).D("Selected Cronet provider is %s, version %s", cronetProvider.getName(), cronetProvider.getVersion());
            return cronetProvider;
        }
        throw new IllegalStateException("Unable to find any enabled Cronet provider");
    }

    @Override // defpackage.aokt
    public final ExperimentalCronetEngine.Builder b() {
        CronetProvider a2 = a();
        if (!d.F(a2.getName(), CronetProvider.PROVIDER_NAME_FALLBACK)) {
            try {
                CronetEngine.Builder createBuilder = a2.createBuilder();
                createBuilder.getClass();
                return (ExperimentalCronetEngine.Builder) createBuilder;
            } catch (ClassCastException e) {
                ((alvg) b.i().h("com/google/android/apps/messaging/shared/net/cronet/CronetEngineBuilderFactory", "createBuilder", 50, "CronetEngineBuilderFactory.kt")).q("Failed cast to ExperimentalCronetEngine.Builder");
                throw new IllegalStateException("Failed cast to ExperimentalCronetEngine.Builder", e);
            }
        }
        ((alvg) b.i().h("com/google/android/apps/messaging/shared/net/cronet/CronetEngineBuilderFactory", "createBuilder", 44, "CronetEngineBuilderFactory.kt")).q("No native Cronet provider found");
        throw new IllegalStateException("No native Cronet provider found");
    }
}
