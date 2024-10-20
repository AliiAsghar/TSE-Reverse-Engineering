package defpackage;

import android.content.ContentValues;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.apps.messaging.shared.receiver.NotificationReceiver;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class wga implements Function {
    private final /* synthetic */ int a;

    public /* synthetic */ wga(int i) {
        this.a = i;
    }

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo416andThen(Function function) {
        switch (this.a) {
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
            case 16:
                return Function$CC.$default$andThen(this, function);
            case 17:
                return Function$CC.$default$andThen(this, function);
            case 18:
                return Function$CC.$default$andThen(this, function);
            case 19:
                return Function$CC.$default$andThen(this, function);
            default:
                return Function$CC.$default$andThen(this, function);
        }
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        Object e;
        switch (this.a) {
            case 0:
                return ((wxb) obj).c;
            case 1:
                apct apctVar = ((wfy) obj).e;
                if (apctVar == null) {
                    apctVar = apct.a;
                }
                return Long.valueOf(apds.a(apctVar));
            case 2:
                return (wgc) ((Optional) obj).get();
            case 3:
                apct apctVar2 = ((wfy) obj).e;
                if (apctVar2 == null) {
                    return apct.a;
                }
                return apctVar2;
            case 4:
                return adom.n((adiv) obj).a;
            case 5:
                apct apctVar3 = ((wfq) obj).f;
                if (apctVar3 == null) {
                    return apct.a;
                }
                return apctVar3;
            case 6:
                apct apctVar4 = ((wfy) obj).e;
                if (apctVar4 == null) {
                    return apct.a;
                }
                return apctVar4;
            case 7:
                return ((ncw) obj).a;
            case 8:
                return ((sqf) obj).h();
            case 9:
                ncw ncwVar = (ncw) obj;
                alwl alwlVar = (alwl) wjn.b.g();
                alvz alvzVar = ydl.b;
                ncwVar.getClass();
                alwlVar.X(alvzVar, ncwVar.a);
                ((alwl) alwlVar.h("com/google/android/apps/messaging/shared/rcsmessagetracking/RcsStillSendingMessageTracker", "initiateFallbackAndComputeNotifyMessages", 207, "RcsStillSendingMessageTracker.java")).q("Auto fallback initiated");
                return ncwVar.a;
            case 10:
                return ((sqf) obj).h();
            case 11:
                return ((wxb) obj).c;
            case 12:
                return Integer.valueOf(((wxb) obj).d);
            case 13:
                return new adiw((String) obj);
            case 14:
                return Integer.valueOf(((wxb) obj).d);
            case 15:
                return adom.n((adiv) obj);
            case 16:
                aozy createBuilder = amso.a.createBuilder();
                long x = ((MessagesTable.BindData) obj).x();
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                amso amsoVar = (amso) createBuilder.b;
                amsoVar.b |= 1;
                amsoVar.c = x;
                return (amso) createBuilder.s();
            case 17:
                e = ((msh) obj).e();
                return e;
            case 18:
                return albo.cv((String) obj);
            case 19:
                alwo alwoVar = NotificationReceiver.a;
                return ((ConversationIdType) obj).a();
            default:
                ContentValues contentValues = (ContentValues) obj;
                ((alwl) ((alwl) NotificationReceiver.a.g()).h("com/google/android/apps/messaging/shared/receiver/NotificationReceiver", "createFailedMessageInfo", 252, "NotificationReceiver.java")).q("Create failed message info");
                ConversationIdType b = ruy.b(contentValues.getAsString("conv_id"));
                MessageIdType b2 = rvc.b(contentValues.getAsString("message_id"));
                aozy createBuilder2 = vjo.a.createBuilder();
                if (!b.b()) {
                    String a = b.a();
                    if (!createBuilder2.b.isMutable()) {
                        createBuilder2.u();
                    }
                    vjo vjoVar = (vjo) createBuilder2.b;
                    a.getClass();
                    vjoVar.b |= 1;
                    vjoVar.c = a;
                }
                if (!b2.b()) {
                    String a2 = b2.a();
                    if (!createBuilder2.b.isMutable()) {
                        createBuilder2.u();
                    }
                    vjo vjoVar2 = (vjo) createBuilder2.b;
                    a2.getClass();
                    vjoVar2.b |= 2;
                    vjoVar2.d = a2;
                }
                return (vjo) createBuilder2.s();
        }
    }

    public final /* synthetic */ Function compose(Function function) {
        switch (this.a) {
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
            case 16:
                return Function$CC.$default$compose(this, function);
            case 17:
                return Function$CC.$default$compose(this, function);
            case 18:
                return Function$CC.$default$compose(this, function);
            case 19:
                return Function$CC.$default$compose(this, function);
            default:
                return Function$CC.$default$compose(this, function);
        }
    }
}
