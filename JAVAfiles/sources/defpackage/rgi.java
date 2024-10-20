package defpackage;

import android.hardware.Sensor;
import android.hardware.SensorEventListener;
import com.google.android.apps.messaging.shared.datamodel.action.SetupExpressiveStickersAction;
import java.util.concurrent.CancellationException;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class rgi implements andy {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public rgi(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // defpackage.andy
    public final void a(Throwable th) {
        if (this.b != 0) {
            koh.a.q("Fail to get phenotype flag config");
            return;
        }
        SetupExpressiveStickersAction.a.n("Failed to download sticker metadata.", th);
        if (th instanceof CancellationException) {
            ((SetupExpressiveStickersAction) this.a).g.d(8);
        } else {
            ((SetupExpressiveStickersAction) this.a).g.d(3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, android.hardware.SensorEventListener] */
    @Override // defpackage.andy
    public final /* synthetic */ void b(Object obj) {
        if (this.b != 0) {
            ?? r4 = this.a;
            koh kohVar = (koh) r4;
            Sensor sensor = kohVar.g;
            if (sensor != null) {
                kohVar.h.registerListener((SensorEventListener) r4, sensor, 2);
                return;
            }
            return;
        }
    }
}
