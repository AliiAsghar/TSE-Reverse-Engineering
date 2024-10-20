package defpackage;

import com.google.android.rcs.client.messaging.data.ContentType;
import com.google.android.rcs.client.messaging.data.GroupMember;
import com.google.android.rcs.client.messaging.data.Message;
import com.google.android.rcs.client.messaging.data.MessageExtensionHeader;
import j$.util.function.Function$CC;
import java.util.AbstractMap;
import java.util.Map;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final /* synthetic */ class ajqy implements Function {
    private final /* synthetic */ int a;

    public /* synthetic */ ajqy(int i) {
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
        switch (this.a) {
            case 0:
                return ((Enum) obj).name();
            case 1:
                return (Enum) ((algw) obj).b();
            case 2:
                return a.aE(obj);
            case 3:
                wbj wbjVar = (wbj) obj;
                String str = wbjVar.c;
                String str2 = wbjVar.d;
                str.getClass();
                str2.getClass();
                return new AbstractMap.SimpleImmutableEntry(str, str2);
            case 4:
                return (wbp) ajtn.c.m().fu((ajqo) obj);
            case 5:
                return (wbz) ajto.b.m().fu((GroupMember) obj);
            case 6:
                return ((MessageExtensionHeader) obj).b();
            case 7:
                Message.MessageContent messageContent = (Message.MessageContent) obj;
                aozy createBuilder = wce.a.createBuilder();
                aozb b = messageContent.b().b();
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                wce wceVar = (wce) createBuilder.b;
                wceVar.b |= 2;
                wceVar.d = b;
                wbi wbiVar = (wbi) ajtr.b.m().fu(messageContent.b().a());
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                wce wceVar2 = (wce) createBuilder.b;
                wbiVar.getClass();
                wceVar2.c = wbiVar;
                wceVar2.b |= 1;
                return (wce) createBuilder.s();
            case 8:
                return ((MessageExtensionHeader) obj).a();
            case 9:
                return ((MessageExtensionHeader) obj).c();
            case 10:
                aozy createBuilder2 = apws.a.createBuilder();
                createBuilder2.bI((Map) obj);
                return (apws) createBuilder2.s();
            case 11:
                return (wbp) ajtr.c.m().fu((ajqo) obj);
            case 12:
                wce wceVar3 = (wce) obj;
                ajur ajurVar = new ajur(null);
                ajurVar.m(wceVar3.d);
                algf algfVar = ajtr.b;
                wbi wbiVar2 = wceVar3.c;
                if (wbiVar2 == null) {
                    wbiVar2 = wbi.a;
                }
                ajurVar.n((ContentType) algfVar.fu(wbiVar2));
                return ajki.i(ajurVar.l());
            case 13:
                return ((akot) obj).b.b();
            case 14:
                return ((akwr) obj).a();
            case 15:
                return ((albd) obj).b;
            case 16:
                albd albdVar = (albd) obj;
                int i = akwk.d;
                return albdVar;
            case 17:
                akwr akwrVar = (akwr) obj;
                int i2 = akwk.d;
                aozy builder = akwrVar.a().d().toBuilder();
                String b2 = akwrVar.b();
                if (!builder.b.isMutable()) {
                    builder.u();
                }
                alax alaxVar = (alax) builder.b;
                b2.getClass();
                alaxVar.c = b2;
                return (alax) builder.s();
            case 18:
                return ((akxj) obj).a;
            case 19:
                return ((akxi) obj).a;
            default:
                akxa akxaVar = akxl.a;
                alau alauVar = ((akxg) obj).a;
                aozy createBuilder3 = albi.a.createBuilder();
                aozy createBuilder4 = apcr.a.createBuilder();
                aozy createBuilder5 = apde.a.createBuilder();
                if (!createBuilder5.b.isMutable()) {
                    createBuilder5.u();
                }
                apde apdeVar = (apde) createBuilder5.b;
                apdeVar.b = 3;
                apdeVar.c = "GenericErrorStatus";
                createBuilder4.ba("@type", (apde) createBuilder5.s());
                apcr apcrVar = (apcr) createBuilder4.s();
                if (!createBuilder3.b.isMutable()) {
                    createBuilder3.u();
                }
                albi albiVar = (albi) createBuilder3.b;
                apcrVar.getClass();
                albiVar.d = apcrVar;
                albiVar.c = 6;
                return (albi) createBuilder3.s();
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
