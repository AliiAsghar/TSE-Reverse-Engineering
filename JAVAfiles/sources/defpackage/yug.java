package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.Collection;
import j$.util.function.Function$CC;
import java.security.KeyPair;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class yug implements Function {
    private final /* synthetic */ int a;

    public /* synthetic */ yug(int i) {
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
        Object obj2;
        switch (this.a) {
            case 0:
                alnr alnrVar = yul.a;
                return yuf.a.createBuilder();
            case 1:
                apct apctVar = ((yum) obj).e;
                if (apctVar == null) {
                    return apct.a;
                }
                return apctVar;
            case 2:
                return yul.a((yub) obj);
            case 3:
                xze xzeVar = yuu.a;
                return aozb.w(((KeyPair) obj).getPublic().getEncoded());
            case 4:
                return Collection.EL.stream((List) obj);
            case 5:
                return aozb.w((byte[]) obj);
            case 6:
                return new ArrayList();
            case 7:
                return new ArrayList();
            case 8:
                snh snhVar = (snh) obj;
                snhVar.e(0);
                return snhVar;
            case 9:
                snh snhVar2 = (snh) obj;
                snhVar2.e(0);
                return snhVar2;
            case 10:
                return ((ParticipantsTable.BindData) obj).M();
            case 11:
                return Long.valueOf(((ParticipantsTable.BindData) obj).s());
            case 12:
                return ((MessagePartCoreData) obj).t();
            case 13:
                return ((Uri) obj).toString();
            case 14:
                String str = (String) obj;
                qel qelVar = yxm.a;
                aozy createBuilder = wxp.a.createBuilder();
                if (!createBuilder.b.isMutable()) {
                    createBuilder.u();
                }
                wxp wxpVar = (wxp) createBuilder.b;
                str.getClass();
                wxpVar.b |= 1;
                wxpVar.c = str;
                return (wxp) createBuilder.s();
            case 15:
                return Boolean.valueOf(((psv) obj).d("urn%3Aurn-7%3A3gpp-application.ims.iari.rcs.ftsms"));
            case 16:
                return ((sqf) obj).h();
            case 17:
                obj2 = ((sxo) obj).a;
                return obj2;
            case 18:
                return albo.cv((String) obj);
            case 19:
                return ((msh) obj).m();
            default:
                uuf uufVar = zke.a;
                return ((msh) obj).k();
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
