package defpackage;

import android.os.IBinder;
import androidx.window.extensions.embedding.SplitInfo;
import java.util.Objects;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class gqp {
    private final goy a;
    private final goy b;
    private final gqn c;
    private final IBinder d;
    private final SplitInfo.Token e;

    public gqp(goy goyVar, goy goyVar2, gqn gqnVar, IBinder iBinder, SplitInfo.Token token) {
        this.a = goyVar;
        this.b = goyVar2;
        this.c = gqnVar;
        this.d = iBinder;
        this.e = token;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gqp)) {
            return false;
        }
        gqp gqpVar = (gqp) obj;
        if (d.F(this.a, gqpVar.a) && d.F(this.b, gqpVar.b) && d.F(this.c, gqpVar.c) && d.F(this.e, gqpVar.e) && d.F(this.d, gqpVar.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i;
        int hashCode = (((this.a.hashCode() * 31) + this.b.hashCode()) * 31) + this.c.hashCode();
        SplitInfo.Token token = this.e;
        int i2 = 0;
        if (token != null) {
            i = token.hashCode();
        } else {
            i = 0;
        }
        int i3 = ((hashCode * 31) + i) * 31;
        IBinder iBinder = this.d;
        if (iBinder != null) {
            i2 = iBinder.hashCode();
        }
        return i3 + i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SplitInfo:{");
        sb.append("primaryActivityStack=" + this.a + ", ");
        sb.append("secondaryActivityStack=" + this.b + ", ");
        sb.append("splitAttributes=" + this.c + ", ");
        SplitInfo.Token token = this.e;
        if (token != null) {
            Objects.toString(token);
            sb.append("token=".concat(String.valueOf(token)));
        }
        IBinder iBinder = this.d;
        if (iBinder != null) {
            Objects.toString(iBinder);
            sb.append("binder=".concat(String.valueOf(iBinder)));
        }
        sb.append("}");
        return sb.toString();
    }

    public gqp(goy goyVar, goy goyVar2, gqn gqnVar) {
        this(goyVar, goyVar2, gqnVar, null, null);
    }

    public gqp(goy goyVar, goy goyVar2, gqn gqnVar, IBinder iBinder) {
        this(goyVar, goyVar2, gqnVar, iBinder, null);
        xzg xzgVar = new xzg((byte[]) null);
        artb artbVar = new artb(3, 4);
        int i = artbVar.a;
        int i2 = artbVar.b;
        int i3 = xzgVar.a;
        if (i > i3 || i3 > i2) {
            throw new UnsupportedOperationException("This API requires extension version " + artbVar + ", but the device is on " + xzgVar.a);
        }
    }
}
