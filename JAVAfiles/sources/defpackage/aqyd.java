package defpackage;

import android.os.Parcel;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class aqyd extends aqyf {
    private final aqux a;
    private final aqut b;
    private final arhn c;

    public aqyd(aqxh aqxhVar, int i, aqux aquxVar, aqut aqutVar, arhn arhnVar) {
        super(aqxhVar, i, arhnVar);
        this.a = aquxVar;
        this.b = aqutVar;
        this.c = arhnVar;
    }

    @Override // defpackage.aqyf
    protected final int a(Parcel parcel) {
        parcel.writeString(this.a.b);
        aqxx.b(parcel, this.b);
        this.c.a();
        if (this.a.a.b()) {
            return 16;
        }
        return 0;
    }

    @Override // defpackage.aqyf
    protected final int b(Parcel parcel) {
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c(aqsn aqsnVar) {
        this.b.e(arcb.b);
        long max = Math.max(0L, aqsnVar.b(TimeUnit.NANOSECONDS));
        this.b.h(arcb.b, Long.valueOf(max));
    }
}
