package defpackage;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class atmn extends atmx {
    private static final long serialVersionUID = -6254521894809367938L;
    private List a;

    @Override // defpackage.atmx
    public final String a() {
        StringBuffer stringBuffer = new StringBuffer();
        List list = this.a;
        if (list != null) {
            stringBuffer.append(list);
            stringBuffer.append(" ");
        }
        stringBuffer.append(" ; payload ");
        stringBuffer.append(this.h);
        stringBuffer.append(", xrcode ");
        stringBuffer.append(f());
        stringBuffer.append(", version ");
        stringBuffer.append((int) ((this.i >>> 16) & 255));
        stringBuffer.append(", flags ");
        stringBuffer.append((int) (this.i & 65535));
        return stringBuffer.toString();
    }

    @Override // defpackage.atmx
    public final atmx b() {
        return new atmn();
    }

    @Override // defpackage.atmx
    public final void c(atkt atktVar) {
        atky atlfVar;
        if (atktVar.d() > 0) {
            this.a = new ArrayList();
        }
        while (atktVar.d() > 0) {
            int b = atktVar.b();
            int b2 = atktVar.b();
            if (atktVar.d() >= b2) {
                int limit = ((ByteBuffer) atktVar.c).limit();
                atktVar.g(b2);
                if (b != 3) {
                    if (b != 8) {
                        if (b != 20732) {
                            atlfVar = new atlf(b);
                        } else {
                            atlfVar = new atkl();
                        }
                    } else {
                        atlfVar = new atkk();
                    }
                } else {
                    atlfVar = new atlf();
                }
                atlfVar.b(atktVar);
                if (limit <= ((ByteBuffer) atktVar.c).capacity()) {
                    ByteBuffer byteBuffer = (ByteBuffer) atktVar.c;
                    byteBuffer.limit(byteBuffer.position());
                    this.a.add(atlfVar);
                } else {
                    throw new IllegalArgumentException("cannot set active region past end of input");
                }
            } else {
                throw new atoc("truncated option");
            }
        }
    }

    @Override // defpackage.atmx
    public final void d(atkv atkvVar, atkn atknVar, boolean z) {
        List<atky> list = this.a;
        if (list != null) {
            for (atky atkyVar : list) {
                atkvVar.d(atkyVar.e);
                int i = atkvVar.a;
                atkvVar.d(0);
                atkyVar.c(atkvVar);
                atkvVar.e((atkvVar.a - i) - 2, i);
            }
        }
    }

    @Override // defpackage.atmx
    public final boolean equals(Object obj) {
        if (super.equals(obj) && this.i == ((atmn) obj).i) {
            return true;
        }
        return false;
    }

    public final int f() {
        return (int) (this.i >>> 24);
    }
}
