package defpackage;

import io.grpc.Status;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes3.dex */
public final class vce implements andy {
    final /* synthetic */ mbm a;
    final /* synthetic */ vdh b;
    final /* synthetic */ vgq c;
    final /* synthetic */ Object d;
    private final /* synthetic */ int e;

    public vce(Object obj, mbm mbmVar, vdh vdhVar, vgq vgqVar, int i) {
        this.e = i;
        this.a = mbmVar;
        this.b = vdhVar;
        this.c = vgqVar;
        this.d = obj;
    }

    @Override // defpackage.andy
    public final void a(Throwable th) {
        if (this.e != 0) {
            this.a.c();
            String str = this.b.b.b;
            if (str != null) {
                ((vcc) this.d).f.g(str, Status.c(th).getCode().value());
            }
            this.c.h(th);
            if (this.c.b().a() == vgo.ANONYMOUS) {
                Status.c(th);
                return;
            }
            return;
        }
        this.a.c();
        String str2 = this.b.b.b;
        if (str2 != null) {
            ((vcf) this.d).d.g(str2, Status.c(th).getCode().value());
        }
        this.c.h(th);
        if (this.c.b().a() == vgo.ANONYMOUS) {
            Status.c(th);
        }
    }

    @Override // defpackage.andy
    public final void b(Object obj) {
        if (this.e != 0) {
            this.a.c();
            String str = this.b.b.b;
            if (str != null) {
                Object obj2 = this.d;
                ((vcc) obj2).f.e(str, Status.b.getCode().value());
            }
            if (this.c.b().a() == vgo.ANONYMOUS) {
                List list = Status.a;
                return;
            }
            return;
        }
        this.a.c();
        String str2 = this.b.b.b;
        if (str2 != null) {
            Object obj3 = this.d;
            ((vcf) obj3).d.e(str2, Status.b.getCode().value());
        }
        if (this.c.b().a() == vgo.ANONYMOUS) {
            List list2 = Status.a;
        }
    }
}
