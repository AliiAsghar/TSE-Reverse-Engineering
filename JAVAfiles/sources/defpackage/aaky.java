package defpackage;

import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import androidx.core.content.FileProvider;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ProfilesTable;
import com.google.android.ims.provisioning.config.Configuration;
import com.google.android.ims.rcsservice.businessinfo.BasePaymentResult;
import com.google.android.rcs.client.messaging.data.MessageClass;
import j$.time.Duration;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Function$CC;
import j$.util.stream.Stream;
import java.io.File;
import java.util.Collections;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class aaky implements Function {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public /* synthetic */ aaky(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // java.util.function.Function
    /* renamed from: andThen */
    public final /* synthetic */ Function mo416andThen(Function function) {
        switch (this.b) {
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

    /* JADX WARN: Type inference failed for: r0v52, types: [msk, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v73, types: [java.lang.Object, arqr] */
    /* JADX WARN: Type inference failed for: r0v75, types: [java.lang.Object, com.google.android.apps.messaging.shared.api.messaging.conversation.ConversationId] */
    /* JADX WARN: Type inference failed for: r0v78, types: [java.lang.Object, arqr] */
    /* JADX WARN: Type inference failed for: r1v32, types: [java.lang.Object, aegu] */
    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        Integer valueOf;
        alog r;
        String ad;
        Integer num;
        int i = 7;
        int i2 = 17;
        Uri uri = null;
        byte b = 0;
        byte b2 = 0;
        switch (this.b) {
            case 0:
                syc sycVar = (syc) obj;
                xze xzeVar = aalt.c;
                sycVar.f((ConversationIdType) this.a);
                sycVar.M(100);
                return sycVar;
            case 1:
                ProfilesTable.BindData bindData = (ProfilesTable.BindData) obj;
                String l = bindData.l();
                bindData.ao(13, "phone_number");
                String str = bindData.n;
                String valueOf2 = String.valueOf(bindData.k());
                long epochMilli = ((aalt) this.a).m.f().toEpochMilli();
                bindData.ao(17, "photo_timestamp");
                return "Profile name: " + l + "\nProfile number: " + str + "\nProfile url: " + valueOf2 + "\nTime since last photo update (in minutes): " + Duration.ofMillis(epochMilli - bindData.r).toMinutes();
            case 2:
                syc sycVar2 = (syc) obj;
                xze xzeVar2 = aalt.c;
                sycVar2.f((ConversationIdType) this.a);
                sycVar2.w(3);
                sycVar2.M(100);
                int[] iArr = {2, 3};
                valueOf = Integer.valueOf(a.bp().c());
                int intValue = valueOf.intValue();
                if (intValue < 13020) {
                    agnc.t("message_report_status", intValue);
                }
                sycVar2.U(new agmf("messages.message_report_status", 3, syc.Y(iArr), true));
                return sycVar2;
            case 3:
                syc sycVar3 = (syc) obj;
                xze xzeVar3 = aalt.c;
                sycVar3.f((ConversationIdType) this.a);
                sycVar3.w(3);
                sycVar3.M(1);
                return sycVar3;
            case 4:
                slc slcVar = (slc) obj;
                taz e = ParticipantsTable.e();
                e.g(new aaky(this.a, i));
                Stream map = Collection.EL.stream(e.b().f()).map(new aakq(i2));
                int i3 = alog.d;
                slcVar.e((Iterable) map.collect(alls.a));
                return slcVar;
            case 5:
                stk stkVar = (stk) obj;
                xze xzeVar4 = aalt.c;
                stkVar.c((MessageIdType) this.a);
                return stkVar;
            case 6:
                vel D = ((wyp) ((aalt) this.a).R.b()).D((String) obj);
                vel.a.o("Clearing Tachyon phone data");
                AtomicReference atomicReference = new AtomicReference();
                return D.b.h().i(new vbl(D, atomicReference, 15, b2 == true ? 1 : 0), andi.a).i(new vbl(D, atomicReference, 16, b == true ? 1 : 0), D.c);
            case 7:
                tbd tbdVar = (tbd) obj;
                tbdVar.l(((vni) ((Optional) ((apxx) ((aalt) this.a).aK).a).get()).m());
                return tbdVar;
            case 8:
                tbd tbdVar2 = (tbd) obj;
                tbdVar2.l(((vni) ((Optional) ((apxx) ((aalt) this.a).aK).a).get()).m());
                return tbdVar2;
            case 9:
                return this.a.n((String) obj);
            case 10:
                Context context = ((aasm) this.a).g;
                return FileProvider.a(context, String.valueOf(context.getPackageName()).concat(".fileprovider"), (File) obj);
            case 11:
                Cursor cursor = (Cursor) obj;
                Uri[] uriArr = aatk.a;
                if (gh.z(cursor.getString(cursor.getColumnIndexOrThrow("mime_type")))) {
                    return ((abac) this.a).h(cursor);
                }
                return new aatd(cursor);
            case 12:
                MessagePartCoreData messagePartCoreData = (MessagePartCoreData) obj;
                amoq a = aauk.a(messagePartCoreData);
                if (a.e == 201 && (ad = messagePartCoreData.ad()) != null && (num = (Integer) ((ydc) this.a).a(ad).a) != null && num.intValue() > 0) {
                    aozy createBuilder = amoq.a.createBuilder();
                    amox amoxVar = amox.a;
                    if (!createBuilder.b.isMutable()) {
                        createBuilder.u();
                    }
                    amoq amoqVar = (amoq) createBuilder.b;
                    amoxVar.getClass();
                    amoqVar.f = amoxVar;
                    amoqVar.e = BasePaymentResult.ERROR_REQUEST_CONNECTION_FAILED;
                    amoq amoqVar2 = (amoq) createBuilder.s();
                    alob alobVar = new alob();
                    alobVar.h(a);
                    alobVar.j(Collections.nCopies(num.intValue(), amoqVar2));
                    r = alobVar.g();
                } else {
                    r = alog.r(a);
                }
                return Collection.EL.stream(r);
            case 13:
                Cursor cursor2 = (Cursor) obj;
                String charSequence = ((znj) ((zrs) this.a).b).z(cursor2.getLong(7)).toString();
                Uri parse = Uri.parse(cursor2.getString(0));
                String string = cursor2.getString(5);
                String string2 = cursor2.getString(1);
                if (albo.ah(string2)) {
                    string2 = cursor2.getString(6);
                }
                String string3 = cursor2.getString(3);
                if (string3 != null) {
                    uri = Uri.parse(string3);
                }
                aaxm aaxmVar = new aaxm();
                aaxmVar.c(parse);
                aaxmVar.a = uri;
                aaxmVar.b(string);
                aaxmVar.b = string2;
                aaxmVar.c = charSequence;
                return aaxmVar.a();
            case 14:
                return Optional.of(((msk) ((abai) this.a).i.b()).r(((adit) obj).a));
            case 15:
                return d.V(this.a, obj);
            case 16:
                snh snhVar = (snh) obj;
                xze xzeVar5 = abcu.a;
                snhVar.j(ruy.b(this.a.b()));
                return snhVar;
            case 17:
                return d.V(this.a, obj);
            case 18:
                MessageClass messageClass = (MessageClass) obj;
                if (ajqt.USER.equals(messageClass.b()) && ajqs.HIGH.equals(messageClass.a()) && (!((Boolean) MessageClass.a.a()).booleanValue() || messageClass.c())) {
                    Object obj2 = this.a;
                    boolean d = messageClass.d();
                    adrh adrhVar = (adrh) ((addi) obj2).i.a(adrh.class);
                    adrhVar.getClass();
                    if (aczx.w() && adrhVar.x() && d) {
                        return Optional.of(adrc.E + ", " + aiff.INTERWORKING_SMS.p);
                    }
                    return Optional.of(adrc.E);
                }
                return Optional.empty();
            case 19:
                adqg adqgVar = (adqg) this.a;
                return new addm(adqgVar, adqgVar.c);
            default:
                return (Configuration) ((adms) this.a).i(adom.n((adiv) obj).a).orElse(null);
        }
    }

    public final /* synthetic */ Function compose(Function function) {
        switch (this.b) {
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
