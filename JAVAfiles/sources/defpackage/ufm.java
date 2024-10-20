package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes3.dex */
final class ufm implements ufw {
    final /* synthetic */ ufn a;

    public ufm(ufn ufnVar) {
        this.a = ufnVar;
        ufnVar.p();
    }

    @Override // defpackage.ufw
    public final int c() {
        return 0;
    }

    @Override // defpackage.ufw
    public final int d() {
        return 2;
    }

    @Override // defpackage.ufw
    public final ufv j() {
        return null;
    }

    @Override // defpackage.ufw
    public final ufx k() {
        return null;
    }

    @Override // defpackage.ufw
    public final /* bridge */ /* synthetic */ ugg l(List list) {
        xyl.h();
        this.a.o();
        try {
            byte[] bArr = this.a.a;
            Bitmap decodeByteArray = BitmapFactory.decodeByteArray(bArr, 0, bArr.length);
            String m = m();
            ufn ufnVar = this.a;
            return new ufh(m, decodeByteArray, ufnVar.d, ufnVar.i, ufnVar.b);
        } finally {
            this.a.r();
            this.a.q();
        }
    }

    @Override // defpackage.ufw
    public final String m() {
        return this.a.e;
    }
}
