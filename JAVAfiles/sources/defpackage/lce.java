package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.database.upgrade.CustomUpgradeSteps;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class lce implements Function {
    public final /* synthetic */ long a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ lce(long j, Object obj, int i) {
        this.c = i;
        this.a = j;
        this.b = obj;
    }

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo416andThen(Function function) {
        switch (this.c) {
            case 0:
                return Function$CC.$default$andThen(this, function);
            case 1:
                return Function$CC.$default$andThen(this, function);
            case 2:
                return Function$CC.$default$andThen(this, function);
            case 3:
                return Function$CC.$default$andThen(this, function);
            case 4:
                return Function$CC.$default$andThen(this, function);
            case 5:
                return Function$CC.$default$andThen(this, function);
            case 6:
                return Function$CC.$default$andThen(this, function);
            case 7:
                return Function$CC.$default$andThen(this, function);
            case 8:
                return Function$CC.$default$andThen(this, function);
            case 9:
                return Function$CC.$default$andThen(this, function);
            case 10:
                return Function$CC.$default$andThen(this, function);
            case 11:
                return Function$CC.$default$andThen(this, function);
            case 12:
                return Function$CC.$default$andThen(this, function);
            case 13:
                return Function$CC.$default$andThen(this, function);
            case 14:
                return Function$CC.$default$andThen(this, function);
            case 15:
                return Function$CC.$default$andThen(this, function);
            default:
                return Function$CC.$default$andThen(this, function);
        }
    }

    /* JADX WARN: Type inference failed for: r0v54, types: [java.lang.Object, java.util.function.Function] */
    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        boolean z;
        Object apply;
        int i = 3;
        int i2 = 2;
        switch (this.c) {
            case 0:
                lcy lcyVar = (lcy) obj;
                long j = this.a;
                lcyVar.b(new ilg(j, i2), new lce(j, this.b, i2));
                return lcyVar;
            case 1:
                syc sycVar = (syc) obj;
                sycVar.h(((sne) this.b).f());
                long j2 = this.a;
                sycVar.H(j2);
                sycVar.B(j2);
                sycVar.V(sycVar);
                return sycVar;
            case 2:
                lcy lcyVar2 = (lcy) obj;
                lcyVar2.n(this.a);
                lcyVar2.i(((ConversationIdType) this.b).a);
                return lcyVar2;
            case 3:
                lcy lcyVar3 = (lcy) obj;
                lcyVar3.n(this.a);
                lcyVar3.i(((ConversationIdType) this.b).a);
                return lcyVar3;
            case 4:
                lcy lcyVar4 = (lcy) obj;
                long j3 = this.a;
                lcyVar4.b(new ilg(j3, i), new lce(j3, this.b, i));
                return lcyVar4;
            case 5:
                Object a = mvg.a.e.a((syc) obj, Long.valueOf(this.a));
                ((syc) a).k(((MessageIdType) this.b).a);
                return a;
            case 6:
                Object a2 = mvg.a.e.a((syc) obj, Long.valueOf(this.a));
                ((syc) a2).k(((MessageIdType) this.b).a);
                return a2;
            case 7:
                Object a3 = mvg.a.e.a((syc) obj, Long.valueOf(this.a));
                ((syc) a3).n(((MessageIdType) this.b).a);
                return a3;
            case 8:
                syc sycVar2 = (syc) obj;
                long j4 = this.a;
                xze xzeVar = rwd.a;
                sycVar2.f((ConversationIdType) this.b);
                sycVar2.w(3);
                sycVar2.M(1);
                sycVar2.U(new agoi("messages.sent_timestamp", 9, Long.valueOf(j4)));
                return sycVar2;
            case 9:
                slc slcVar = (slc) obj;
                CustomUpgradeSteps.lambda$toOtherConversationToParticipants$0((ConversationIdType) this.b, this.a, slcVar);
                return slcVar;
            case 10:
                tez tezVar = (tez) obj;
                tezVar.b((MessageIdType) this.b);
                tezVar.c(this.a);
                return tezVar;
            case 11:
                tez tezVar2 = (tez) obj;
                tezVar2.b((MessageIdType) this.b);
                tezVar2.c(this.a);
                return tezVar2;
            case 12:
                ParticipantsTable.BindData bindData = (ParticipantsTable.BindData) obj;
                long parseLong = Long.parseLong(bindData.M());
                ujv ujvVar = (ujv) this.b;
                String n = ((iew) ujvVar.i.b()).n(bindData, false);
                int n2 = bindData.n();
                Uri a4 = ujvVar.g.a(bindData);
                if (n2 == 3) {
                    z = true;
                } else {
                    z = false;
                }
                return new rtw(parseLong, n, z, a4, this.a);
            case 13:
                syc sycVar3 = (syc) obj;
                alvi alviVar = ulw.a;
                sycVar3.f((ConversationIdType) this.b);
                sycVar3.D(this.a);
                return sycVar3;
            case 14:
                syc sycVar4 = (syc) obj;
                sycVar4.f((ConversationIdType) this.b);
                sycVar4.D(this.a);
                return sycVar4;
            case 15:
                yob yobVar = (yob) obj;
                long j5 = this.a;
                utz utzVar = ynr.a;
                yobVar.b((ConversationIdType) this.b);
                yobVar.U(new agoi("spam_logging_ids_table.generation_timestamp", 9, Long.valueOf(j5)));
                return yobVar;
            default:
                yuf yufVar = (yuf) obj;
                alnr alnrVar = yul.a;
                apply = this.b.apply(yufVar);
                aozy aozyVar = (aozy) apply;
                long j6 = this.a;
                apct b = apds.b(j6);
                if (!aozyVar.b.isMutable()) {
                    aozyVar.u();
                }
                yuf yufVar2 = (yuf) aozyVar.b;
                yuf yufVar3 = yuf.a;
                b.getClass();
                yufVar2.i = b;
                yufVar2.b |= 1;
                long j7 = yufVar.k + 1;
                if (!aozyVar.b.isMutable()) {
                    aozyVar.u();
                }
                ((yuf) aozyVar.b).k = j7;
                apct apctVar = yufVar.i;
                if (apctVar == null) {
                    apctVar = apct.a;
                }
                long a5 = apds.a(apctVar);
                if (a5 > j6) {
                    xyo e = yul.b.e();
                    e.H("Trying to update VerifiedSmsData with old data: update time must advance");
                    e.y("now", j6);
                    apct apctVar2 = yufVar.i;
                    if (apctVar2 == null) {
                        apctVar2 = apct.a;
                    }
                    e.z("oldUpdateTime", apctVar2);
                    e.y("diff_seconds", (a5 - j6) / 1000);
                    e.q();
                    yty ytyVar = ((yuf) aozyVar.b).j;
                    if (ytyVar == null) {
                        ytyVar = yty.a;
                    }
                    aozy builder = ytyVar.toBuilder();
                    if (!builder.b.isMutable()) {
                        builder.u();
                    }
                    ((yty) builder.b).b = true;
                    yty ytyVar2 = (yty) builder.s();
                    if (!aozyVar.b.isMutable()) {
                        aozyVar.u();
                    }
                    yuf yufVar4 = (yuf) aozyVar.b;
                    ytyVar2.getClass();
                    yufVar4.j = ytyVar2;
                    yufVar4.b |= 2;
                }
                return (yuf) aozyVar.s();
        }
    }

    public final /* synthetic */ Function compose(Function function) {
        switch (this.c) {
            case 0:
                return Function$CC.$default$compose(this, function);
            case 1:
                return Function$CC.$default$compose(this, function);
            case 2:
                return Function$CC.$default$compose(this, function);
            case 3:
                return Function$CC.$default$compose(this, function);
            case 4:
                return Function$CC.$default$compose(this, function);
            case 5:
                return Function$CC.$default$compose(this, function);
            case 6:
                return Function$CC.$default$compose(this, function);
            case 7:
                return Function$CC.$default$compose(this, function);
            case 8:
                return Function$CC.$default$compose(this, function);
            case 9:
                return Function$CC.$default$compose(this, function);
            case 10:
                return Function$CC.$default$compose(this, function);
            case 11:
                return Function$CC.$default$compose(this, function);
            case 12:
                return Function$CC.$default$compose(this, function);
            case 13:
                return Function$CC.$default$compose(this, function);
            case 14:
                return Function$CC.$default$compose(this, function);
            case 15:
                return Function$CC.$default$compose(this, function);
            default:
                return Function$CC.$default$compose(this, function);
        }
    }

    public /* synthetic */ lce(Object obj, long j, int i) {
        this.c = i;
        this.b = obj;
        this.a = j;
    }
}
