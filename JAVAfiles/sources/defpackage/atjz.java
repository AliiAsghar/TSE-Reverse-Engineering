package defpackage;

import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class atjz extends atmx {
    private static final long serialVersionUID = -1348173791712935864L;
    private List a;

    public static boolean e(int i, int i2) {
        if (i == 1) {
            if (i2 > 32) {
                return false;
            }
        } else if (i == 2 && i2 > 128) {
            return false;
        }
        return true;
    }

    @Override // defpackage.atmx
    public final String a() {
        StringBuffer stringBuffer = new StringBuffer();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            stringBuffer.append((atjy) it.next());
            if (it.hasNext()) {
                stringBuffer.append(" ");
            }
        }
        return stringBuffer.toString();
    }

    @Override // defpackage.atmx
    public final atmx b() {
        return new atjz();
    }

    @Override // defpackage.atmx
    public final void c(atkt atktVar) {
        boolean z;
        atjy atjyVar;
        this.a = new ArrayList(1);
        while (atktVar.d() != 0) {
            int b = atktVar.b();
            int c = atktVar.c();
            int c2 = atktVar.c();
            if ((c2 & 128) != 0) {
                z = true;
            } else {
                z = false;
            }
            byte[] i = atktVar.i(c2 & (-129));
            if (e(b, c)) {
                if (b != 1 && b != 2) {
                    atjyVar = new atjy(b, z, i, c);
                } else {
                    int length = i.length;
                    int f = atow.f(b);
                    if (length <= f) {
                        if (length != f) {
                            byte[] bArr = new byte[f];
                            System.arraycopy(i, 0, bArr, 0, length);
                            i = bArr;
                        }
                        InetAddress byAddress = InetAddress.getByAddress(i);
                        atjyVar = new atjy(atow.g(byAddress), z, byAddress, c);
                    } else {
                        throw new atoc("invalid address length");
                    }
                }
                this.a.add(atjyVar);
            } else {
                throw new atoc("invalid prefix length");
            }
        }
    }

    @Override // defpackage.atmx
    public final void d(atkv atkvVar, atkn atknVar, boolean z) {
        byte[] address;
        int i;
        int i2;
        for (atjy atjyVar : this.a) {
            int i3 = atjyVar.a;
            if (i3 != 1 && i3 != 2) {
                address = (byte[]) atjyVar.d;
                i = address.length;
            } else {
                address = ((InetAddress) atjyVar.d).getAddress();
                int length = address.length;
                while (true) {
                    length--;
                    if (length >= 0) {
                        if (address[length] != 0) {
                            i = length + 1;
                            break;
                        }
                    } else {
                        i = 0;
                        break;
                    }
                }
            }
            if (atjyVar.b) {
                i2 = i | 128;
            } else {
                i2 = i;
            }
            atkvVar.d(atjyVar.a);
            atkvVar.g(atjyVar.c);
            atkvVar.g(i2);
            atkvVar.b(address, 0, i);
        }
    }
}
