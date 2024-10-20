package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.net.InetAddress;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aiig implements aiid {
    public static final /* synthetic */ int a = 0;
    private static final alog b;
    private static final Executor c;
    private final alog d;

    static {
        int i = alog.d;
        b = alsx.a;
        c = andi.a;
    }

    public aiig(aiid aiidVar, List list) {
        alob alobVar = new alob();
        alobVar.h(aiidVar);
        alobVar.j(list);
        this.d = alobVar.g();
    }

    @Override // defpackage.aiid
    public final ListenableFuture a(String str) {
        return d(str, InetAddress.class, 0);
    }

    @Override // defpackage.aiid
    public final ListenableFuture b(String str) {
        return d(str, atmb.class, 0);
    }

    @Override // defpackage.aiid
    public final ListenableFuture c(String str) {
        return d(str, atng.class, 0);
    }

    public final ListenableFuture d(final String str, final Class cls, final int i) {
        ListenableFuture f;
        if (i >= ((alsx) this.d).c) {
            return albo.bI(b);
        }
        if (i > 0) {
            advr.q("making fallback DNS query for target %s", str);
        }
        if (cls.equals(atmb.class)) {
            f = ancj.f(((aiid) this.d.get(i)).b(str), new ahnx(13), c);
        } else if (cls.equals(atng.class)) {
            f = ancj.f(((aiid) this.d.get(i)).c(str), new ahnx(14), c);
        } else if (cls.equals(InetAddress.class)) {
            f = ancj.f(((aiid) this.d.get(i)).a(str), new ahnx(15), c);
        } else {
            throw new IllegalArgumentException("unexpected record classs: ".concat(String.valueOf(cls.getName())));
        }
        final ListenableFuture listenableFuture = f;
        return ancj.g(anee.o(listenableFuture), new ancs() { // from class: aiif
            @Override // defpackage.ancs
            public final ListenableFuture a(Object obj) {
                if (!((List) obj).isEmpty()) {
                    return listenableFuture;
                }
                int i2 = i;
                Class cls2 = cls;
                return aiig.this.d(str, cls2, i2 + 1);
            }
        }, c);
    }
}
