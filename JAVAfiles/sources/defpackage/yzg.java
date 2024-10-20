package defpackage;

import android.content.Context;
import android.text.format.Formatter;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class yzg extends arrp implements arqg {
    final /* synthetic */ long a;
    final /* synthetic */ Object b;
    final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yzg(long j, lfx lfxVar, kay kayVar, int i) {
        super(0);
        this.d = i;
        this.a = j;
        this.c = lfxVar;
        this.b = kayVar;
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [java.lang.Object, arqg] */
    @Override // defpackage.arqg
    public final /* synthetic */ Object a() {
        String formatFileSize;
        if (this.d != 0) {
            long j = this.a;
            if (j <= 0) {
                formatFileSize = "";
            } else {
                formatFileSize = Formatter.formatFileSize((Context) ((lfx) this.c).a, j);
            }
            formatFileSize.getClass();
            kay kayVar = (kay) this.b;
            String str = kayVar.c;
            return new aeki(new aejb(formatFileSize, str), new aekh((byte[]) null), str, kayVar.b, new jkq(this.c, this.b, 15, null), 32);
        }
        if (!((pnw) ((yyz) this.b).b.b()).a() || !((abul) ((yyz) this.b).a.b()).e(this.a)) {
            this.c.a();
        }
        return arnb.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yzg(yyz yyzVar, long j, arqg arqgVar, int i) {
        super(0);
        this.d = i;
        this.b = yyzVar;
        this.a = j;
        this.c = arqgVar;
    }
}
