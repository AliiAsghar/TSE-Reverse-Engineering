package defpackage;

import com.google.android.ims.provisioning.config.Configuration;
import com.google.android.ims.provisioning.config.InstantMessageConfiguration;
import com.google.android.rcs.client.messaging.data.RcsDestinationId;
import j$.util.function.Function$CC;
import java.net.URI;
import java.util.function.Function;
import org.apache.http.client.methods.HttpRequestBase;

/* compiled from: PG */
/* loaded from: classes.dex */
public final /* synthetic */ class acpr implements Function {
    private final /* synthetic */ int a;

    public /* synthetic */ acpr(int i) {
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
                int T = a.T(((aouh) obj).E);
                if (T == 0) {
                    T = 1;
                }
                return acpt.O(T);
            case 1:
                return ((aouh) obj).B;
            case 2:
                aouh aouhVar = (aouh) obj;
                if (aouhVar.e != 2) {
                    return "";
                }
                return (String) aouhVar.f;
            case 3:
                return Boolean.valueOf(((aouh) obj).n);
            case 4:
                aozn aoznVar = ((aouh) obj).J;
                if (aoznVar == null) {
                    return aozn.a;
                }
                return aoznVar;
            case 5:
                return Long.valueOf(apdp.a((aozn) obj));
            case 6:
                aouh aouhVar2 = (aouh) obj;
                if (aouhVar2.e != 3) {
                    return "";
                }
                return (String) aouhVar2.f;
            case 7:
                return acqk.d((aiom) obj);
            case 8:
                return Long.valueOf(Long.parseLong((String) obj));
            case 9:
                return ((String) obj).toString();
            case 10:
                return ((HttpRequestBase) obj).getURI();
            case 11:
                return ((URI) obj).getHost();
            case 12:
                return ((Configuration) obj).mInstantMessageConfiguration;
            case 13:
                return ((InstantMessageConfiguration) obj).mConferenceFactoryUri;
            case 14:
                return ((RcsDestinationId) obj).a();
            case 15:
                acyz acyzVar = adas.a;
                return ((acoz) obj).d;
            case 16:
                return ((acom) obj).b;
            case 17:
                return ((acom) obj).c;
            case 18:
                return ((acom) obj).e;
            case 19:
                return ((Configuration) obj).c();
            default:
                return ((adju) obj).m;
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
