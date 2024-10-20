package defpackage;

import android.util.Log;
import io.grpc.Status;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collection;
import org.chromium.net.BidirectionalStream;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aqyy extends arce {
    public static final /* synthetic */ int i = 0;
    public final Object a;
    public final Collection b;
    public boolean c;
    public boolean d;
    public Status e;
    public boolean f;
    public boolean g;
    final /* synthetic */ aqyz h;
    private int u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aqyy(aqyz aqyzVar, int i2, arhn arhnVar, Object obj, arhu arhuVar) {
        super(i2, arhnVar, arhuVar);
        this.h = aqyzVar;
        this.b = new ArrayList();
        this.d = false;
        this.a = obj;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* bridge */ /* synthetic */ void f(aqyy aqyyVar, ByteBuffer byteBuffer) {
        aqyyVar.u += byteBuffer.remaining();
        super.n(new arfk(byteBuffer), false);
    }

    @Override // defpackage.areg
    public final void a(int i2) {
        this.h.k.getClass();
        int i3 = this.u - i2;
        this.u = i3;
        if (i3 == 0 && !this.f) {
            if (Log.isLoggable("grpc-java-cronet", 2)) {
                Log.v("grpc-java-cronet", "BidirectionalStream.read");
            }
            this.h.k.read(ByteBuffer.allocateDirect(4096));
        }
    }

    @Override // defpackage.areg
    public final void b(Throwable th) {
        c(Status.c(th), true, new aqut());
    }

    @Override // defpackage.arce
    protected final void c(Status status, boolean z, aqut aqutVar) {
        BidirectionalStream bidirectionalStream = this.h.k;
        bidirectionalStream.getClass();
        bidirectionalStream.cancel();
        l(status, z, aqutVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.aqzh
    public final void d() {
        super.d();
    }

    @Override // defpackage.aqzk
    public final void e(Runnable runnable) {
        synchronized (this.a) {
            runnable.run();
        }
    }
}
