package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes4.dex */
public class akww {
    public String a;
    public Object b;
    public akwy c;
    public Boolean d;
    private final atii e;

    /* JADX INFO: Access modifiers changed from: protected */
    public akww(atii atiiVar) {
        this.e = atiiVar;
    }

    public akwx a() {
        this.b.getClass();
        this.c.getClass();
        return new akym(this.e, Optional.ofNullable(this.a), this.b, this.c, Optional.ofNullable(this.d), new sp(16));
    }

    public final void b(final akwy akwyVar) {
        this.c = new akwy() { // from class: akxf
            @Override // defpackage.akwy
            public final ListenableFuture b(Object obj) {
                akxe akxeVar = (akxe) obj;
                if (akxeVar.a.isPresent()) {
                    return akwy.this.b(akxeVar.a.get());
                }
                return d.m(new uqe(akxl.a, 8));
            }
        };
    }

    public final void c(akzo akzoVar) {
        akzm akzmVar = new akzm(akzoVar.b);
        if (!akzoVar.a.isEmpty()) {
            for (akzn akznVar : akzoVar.a) {
                akznVar.b();
                akznVar.b();
                akzmVar.b(akznVar.a());
            }
        }
        akzmVar.b = true;
        akzmVar.c = true;
        this.b = new akxj(akzmVar.a());
    }

    public akww() {
        this(akxl.b);
    }
}
