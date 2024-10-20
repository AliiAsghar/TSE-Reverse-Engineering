package defpackage;

import java.net.SocketAddress;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class aifz implements aipb {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ aifz(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    @Override // defpackage.aipb
    public final void a() {
        int i = this.c;
        if (i != 0) {
            if (i != 1) {
                ((aifn) this.a).a.connect((SocketAddress) this.b);
                return;
            } else {
                ((aifv) this.a).b((byte[]) this.b);
                return;
            }
        }
        ((aifm) this.a).a.connect((SocketAddress) this.b);
    }
}
