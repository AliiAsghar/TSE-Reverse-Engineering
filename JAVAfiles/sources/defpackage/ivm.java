package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import java.util.Arrays;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class ivm implements alvj {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ ivm(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v29, types: [java.lang.CharSequence, java.lang.Object] */
    @Override // defpackage.alvj
    public final Object a() {
        switch (this.b) {
            case 0:
                alvi alviVar = ixd.a;
                return yyb.bh(this.a.toString());
            case 1:
                alvi alviVar2 = ixd.a;
                return yyb.bh(this.a.toString());
            case 2:
                alwo alwoVar = vuz.a;
                taz e = ParticipantsTable.e();
                e.w("getLoggableOriginatorParticipantSubIds");
                e.g(new vte(this.a, 6));
                e.h(new atkn((Object) ParticipantsTable.c.d, false));
                return e.b().g();
            case 3:
                return yyb.bh(((Uri) this.a).toString());
            case 4:
                return yyb.bh(((Uri) this.a).toString());
            case 5:
                return yyb.bh(((Uri) this.a).toString());
            case 6:
                return yyb.bh(((Uri) this.a).toString());
            case 7:
                return yyb.be(this.a);
            case 8:
                return yyb.bf((Uri) this.a);
            case 9:
                return ((yer) this.a).j();
            case 10:
                alvi alviVar3 = agzo.a;
                Object obj = this.a;
                if (obj == null) {
                    return "null";
                }
                return Arrays.toString((Object[]) obj);
            default:
                alvi alviVar4 = agzo.a;
                Object obj2 = this.a;
                if (obj2 == null) {
                    return "null";
                }
                return Arrays.toString((Object[]) obj2);
        }
    }
}
