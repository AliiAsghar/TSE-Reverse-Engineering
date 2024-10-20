package defpackage;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aamx extends arpw implements arqv {
    final /* synthetic */ int a;
    final /* synthetic */ int b;
    final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aamx(int i, jzu jzuVar, int i2, arpe arpeVar, int i3) {
        super(2, arpeVar);
        this.d = i3;
        this.b = i;
        this.c = jzuVar;
        this.a = i2;
    }

    @Override // defpackage.arqv
    public final /* synthetic */ Object a(Object obj, Object obj2) {
        if (this.d != 0) {
            return ((aamx) c((arwe) obj, (arpe) obj2)).b(arnb.a);
        }
        return ((aamx) c((arwe) obj, (arpe) obj2)).b(arnb.a);
    }

    @Override // defpackage.arpq
    public final Object b(Object obj) {
        if (this.d != 0) {
            aqil.P(obj);
            int i = this.b;
            if (i > 0) {
                ((jzu) this.c).a.d("Bugle.MessageUiDataCache.Hit", i);
            }
            int i2 = this.a;
            if (i2 > 0) {
                ((jzu) this.c).a.d("Bugle.MessageUiDataCache.Miss", i2);
            }
            return arnb.a;
        }
        aqil.P(obj);
        Object obj2 = this.c;
        return new arog(arrn.g(arrn.k(arrn.h(armd.h(new BufferedReader(new InputStreamReader(new FileInputStream((File) obj2), arul.a), 8192)), this.a), this.b)));
    }

    @Override // defpackage.arpq
    public final arpe c(Object obj, arpe arpeVar) {
        if (this.d != 0) {
            return new aamx(this.b, (jzu) this.c, this.a, arpeVar, 1);
        }
        return new aamx((File) this.c, this.a, this.b, arpeVar, 0);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aamx(File file, int i, int i2, arpe arpeVar, int i3) {
        super(2, arpeVar);
        this.d = i3;
        this.c = file;
        this.a = i;
        this.b = i2;
    }
}
