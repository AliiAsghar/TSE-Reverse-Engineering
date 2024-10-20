package defpackage;

import android.database.Cursor;
import android.os.CancellationSignal;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aixa extends aixd {
    final /* synthetic */ Object[] a;
    final /* synthetic */ String b;
    final /* synthetic */ aixe c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aixa(aixe aixeVar, Object[] objArr, String str) {
        super(aixeVar);
        this.a = objArr;
        this.b = str;
        this.c = aixeVar;
    }

    @Override // defpackage.aixl
    public final Cursor a(CancellationSignal cancellationSignal) {
        this.c.d.s();
        try {
            return this.c.a.rawQueryWithFactory(new aixr(this.a), this.b, null, null, cancellationSignal);
        } finally {
            this.c.d.r();
        }
    }

    @Override // defpackage.aixl
    public final String b() {
        return this.b;
    }
}
