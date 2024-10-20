package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.os.PersistableBundle;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.gms.constellation.PhoneNumberInfo;
import com.google.android.ims.provisioning.config.Configuration;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.List;
import java.util.function.Function;
import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final /* synthetic */ class ybe implements Function {
    private final /* synthetic */ int a;

    public /* synthetic */ ybe(int i) {
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
                return Collection.EL.stream((List) obj);
            case 1:
                return ((yau) obj).b;
            case 2:
                return ((PhoneNumberInfo) obj).b;
            case 3:
                return Boolean.valueOf(((ydg) obj).a());
            case 4:
                return ((adje) obj).l();
            case 5:
                int i = ((Configuration) obj).mInstantMessageConfiguration.mWarnSizeFileTransfer;
                if (i == 0) {
                    i = 104857600;
                }
                return Integer.valueOf(i);
            case 6:
                return Integer.valueOf(ydf.c((Configuration) obj));
            case 7:
                return Boolean.valueOf(((Configuration) obj).mInstantMessageConfiguration.mFileTransferAutoAcceptSupported);
            case 8:
                return yyb.bl((Uri) obj);
            case 9:
                tga tgaVar = (tga) obj;
                tgaVar.U(new agmg("recent_gifs.content_uri", 6));
                return tgaVar;
            case 10:
                return ((iew) obj).a;
            case 11:
                obj2 = ((sxo) obj).a;
                return obj2;
            case 12:
                return (szt) obj;
            case 13:
                return (szt) obj;
            case 14:
                syc sycVar = (syc) obj;
                sycVar.R();
                return sycVar;
            case 15:
                syc sycVar2 = (syc) obj;
                sycVar2.N();
                return sycVar2;
            case 16:
                return ((Optional) obj).stream();
            case 17:
                return new Bundle((PersistableBundle) obj);
            case 18:
                snh snhVar = (snh) obj;
                snhVar.c(tqc.SPAM_FOLDER);
                return snhVar;
            case 19:
                return ((MessageCoreData) obj).w();
            default:
                ysx ysxVar = (ysx) obj;
                return new ysz(Pattern.compile(ysxVar.c).matcher(""), ysxVar.d, ysxVar.e);
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
