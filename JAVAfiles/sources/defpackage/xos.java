package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.MessagesTable;
import com.google.android.ims.provisioning.config.Configuration;
import com.google.android.rcs.client.messaging.data.ContentType;
import com.google.android.rcs.client.messaging.data.FileInformation;
import j$.time.Duration;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class xos implements Function {
    private final /* synthetic */ int a;

    public /* synthetic */ xos(int i) {
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
        String o;
        switch (this.a) {
            case 0:
                return ((xow) obj).l();
            case 1:
                return ((MessagesTable.BindData) obj).A();
            case 2:
                return Optional.of((xow) obj);
            case 3:
                alwo alwoVar = xqb.a;
                return ((MessagesTable.BindData) obj).D().b;
            case 4:
                alwo alwoVar2 = xrf.a;
                return ((FileInformation) obj).b().toString();
            case 5:
                pwr pwrVar = (pwr) obj;
                alwo alwoVar3 = xru.a;
                aozy createBuilder = amro.a.createBuilder();
                amrn amrnVar = amrn.NO_RETRY;
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                amro amroVar = (amro) createBuilder.b;
                amroVar.c = amrnVar.f;
                amroVar.b |= 1;
                return pwrVar.d(1, (amro) createBuilder.s());
            case 6:
                return ((ContentType) obj).toString();
            case 7:
                return Long.valueOf(((Duration) obj).toMillis());
            case 8:
                return ((aozb) obj).H();
            case 9:
                return ((ContentType) obj).toString();
            case 10:
                return ((Configuration) obj).mInstantMessageConfiguration.mFtHttpContentServerUri;
            case 11:
                return ((ContentType) obj).toString();
            case 12:
                int i = xxb.c;
                return ((tar) obj).f;
            case 13:
                tbd tbdVar = (tbd) obj;
                int i2 = xxb.c;
                tbdVar.c();
                return tbdVar;
            case 14:
                tbd tbdVar2 = (tbd) obj;
                alwo alwoVar4 = xxe.a;
                tbdVar2.c();
                return tbdVar2;
            case 15:
                tbd tbdVar3 = (tbd) obj;
                alwo alwoVar5 = xxe.a;
                tbdVar3.c();
                return tbdVar3;
            case 16:
                tbd tbdVar4 = (tbd) obj;
                alwo alwoVar6 = xxe.a;
                tbdVar4.c();
                return tbdVar4;
            case 17:
                tar tarVar = (tar) obj;
                alwo alwoVar7 = xxe.a;
                return new tas[]{tarVar.f, tarVar.g};
            case 18:
                tar tarVar2 = (tar) obj;
                alwo alwoVar8 = xxh.a;
                return new tas[]{tarVar2.v, tarVar2.f, tarVar2.h, tarVar2.z};
            case 19:
                return Integer.valueOf(((xxw) obj).ordinal());
            default:
                o = ((msh) obj).o(((Boolean) new mss(0).get()).booleanValue());
                return o;
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
