package defpackage;

import android.util.Log;
import io.grpc.Status;
import java.nio.ByteBuffer;
import java.util.Collection;
import java.util.concurrent.Executor;
import org.chromium.net.BidirectionalStream;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aqyz extends aqzf {
    public static final ByteBuffer a = ByteBuffer.allocateDirect(0);

    @Deprecated
    static final aqrq b = new aqrq("cronet-annotation", null);
    public static final aqrq c = new aqrq("cronet-annotations", null);
    public final String d;
    public final String e;
    public final arhn f;
    public final Executor g;
    public final aqut h;
    public final aqzb i;
    public final Runnable j;
    public BidirectionalStream k;
    public final boolean l;
    public final Object m;
    public final Collection n;
    public final aqyy o;
    public aqyu p;
    private final arja t;

    public aqyz(String str, String str2, Executor executor, aqut aqutVar, aqzb aqzbVar, Runnable runnable, Object obj, int i, aqux aquxVar, arhn arhnVar, aqrr aqrrVar, arhu arhuVar) {
        super(new arjo(1), arhnVar, arhuVar, aqutVar, aqrrVar);
        this.t = new arja(this, 1);
        this.d = str;
        this.e = str2;
        this.f = arhnVar;
        this.g = executor;
        this.h = aqutVar;
        this.i = aqzbVar;
        this.j = runnable;
        this.l = aquxVar.a == aquw.UNARY;
        this.m = aqrrVar.f(b);
        this.n = (Collection) aqrrVar.f(c);
        this.o = new aqyy(this, i, arhnVar, obj, arhuVar);
        f();
    }

    @Override // defpackage.araj
    public final aqrm a() {
        return aqrm.a;
    }

    @Override // defpackage.aqzf
    protected final /* synthetic */ aqze p() {
        return this.t;
    }

    @Override // defpackage.aqzf, defpackage.aqzi
    protected final /* synthetic */ aqzh q() {
        return this.o;
    }

    public final void r(Status status) {
        this.i.a(this, status);
    }

    public final void s(ByteBuffer byteBuffer, boolean z, boolean z2) {
        if (this.k != null) {
            if (Log.isLoggable("grpc-java-cronet", 2)) {
                Log.v("grpc-java-cronet", "BidirectionalStream.write");
            }
            this.k.write(byteBuffer, z);
            if (z2) {
                if (Log.isLoggable("grpc-java-cronet", 2)) {
                    Log.v("grpc-java-cronet", "BidirectionalStream.flush");
                }
                this.k.flush();
            }
        }
    }

    @Override // defpackage.aqzf
    protected final /* synthetic */ aqzh t() {
        return this.o;
    }
}
