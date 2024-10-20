package defpackage;

import android.database.Cursor;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes4.dex */
final class afjv extends arpw implements arqr {
    Object a;
    Object b;
    Object c;
    int d;
    final /* synthetic */ Cursor e;
    final /* synthetic */ afjy f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afjv(Cursor cursor, afjy afjyVar, arpe arpeVar) {
        super(1, arpeVar);
        this.e = cursor;
        this.f = afjyVar;
    }

    @Override // defpackage.arqr
    public final /* bridge */ /* synthetic */ Object a(Object obj) {
        return new afjv(this.e, this.f, (arpe) obj).b(arnb.a);
    }

    @Override // defpackage.arpq
    public final Object b(Object obj) {
        Object afiuVar;
        String str;
        Object obj2;
        Object obj3;
        arpl arplVar = arpl.a;
        if (this.d != 0) {
            obj2 = this.c;
            obj3 = this.b;
            afiuVar = this.a;
            aqil.P(obj);
        } else {
            aqil.P(obj);
            afiuVar = new afiu(this.e.getLong(1));
            Instant ofEpochMilli = Instant.ofEpochMilli(this.e.getLong(2));
            ofEpochMilli.getClass();
            if (!this.e.isNull(3)) {
                str = this.e.getString(3);
            } else {
                str = null;
            }
            afjy afjyVar = this.f;
            String string = this.e.getString(0);
            string.getClass();
            this.a = afiuVar;
            this.b = ofEpochMilli;
            this.c = str;
            this.d = 1;
            Object a = afjyVar.e.c.a(string, this);
            if (a != arplVar) {
                obj2 = str;
                obj3 = ofEpochMilli;
                obj = a;
            } else {
                return arplVar;
            }
        }
        return new afjz(obj, (afiu) afiuVar, (Instant) obj3, (String) obj2);
    }
}
