package defpackage;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import org.xbill.DNS2.ResolverConfig;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class atnk implements atna {
    private static int d;
    public InetSocketAddress a;
    public InetSocketAddress b;
    public boolean c;
    private long e;

    public atnk() {
        this(null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x022c, code lost:
    
        return r11;
     */
    @Override // defpackage.atna
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.atlz a(defpackage.atlz r18) {
        /*
            Method dump skipped, instructions count: 615
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.atnk.a(atlz):atlz");
    }

    @Override // defpackage.atna
    public final Object b(atlz atlzVar, atla atlaVar) {
        Integer num;
        String str;
        synchronized (this) {
            int i = d;
            d = i + 1;
            num = new Integer(i);
        }
        atmx c = atlzVar.c();
        if (c != null) {
            str = c.f.toString();
        } else {
            str = "(none)";
        }
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(getClass());
        stringBuffer.append(": ");
        stringBuffer.append(str);
        String stringBuffer2 = stringBuffer.toString();
        atmz atmzVar = new atmz(this, atlzVar, num, atlaVar);
        atmzVar.setName(stringBuffer2);
        atmzVar.setDaemon(true);
        atmzVar.start();
        return num;
    }

    @Override // defpackage.atna
    public final void c(int i) {
        this.e = i * 1000;
    }

    public atnk(String str) {
        InetAddress byName;
        this.e = 10000L;
        if (str == null) {
            String[] strArr = ResolverConfig.b().servers;
            str = strArr == null ? null : strArr[0];
            if (str == null) {
                str = "localhost";
            }
        }
        if (str.equals("0")) {
            byName = InetAddress.getLocalHost();
        } else {
            byName = InetAddress.getByName(str);
        }
        this.a = new InetSocketAddress(byName, 53);
    }
}
