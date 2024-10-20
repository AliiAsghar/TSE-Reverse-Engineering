package defpackage;

import android.content.Context;
import android.webkit.WebView;
import com.google.android.apps.messaging.R;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class aeys extends arrp implements arqr {
    private final /* synthetic */ int u;
    public static final aeys t = new aeys(20);
    public static final aeys s = new aeys(19);
    public static final aeys r = new aeys(18);
    public static final aeys q = new aeys(17);
    public static final aeys p = new aeys(16);
    public static final aeys o = new aeys(15);
    public static final aeys n = new aeys(14);
    public static final aeys m = new aeys(12);
    public static final aeys l = new aeys(11);
    public static final aeys k = new aeys(10);
    public static final aeys j = new aeys(9);
    public static final aeys i = new aeys(8);
    public static final aeys h = new aeys(7);
    public static final aeys g = new aeys(6);
    public static final aeys f = new aeys(5);
    public static final aeys e = new aeys(4);
    public static final aeys d = new aeys(3);
    public static final aeys c = new aeys(2);
    public static final aeys b = new aeys(1);
    public static final aeys a = new aeys(0);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aeys(int i2) {
        super(1);
        this.u = i2;
    }

    @Override // defpackage.arqr
    public final /* synthetic */ Object a(Object obj) {
        boolean z = true;
        afri afriVar = null;
        switch (this.u) {
            case 0:
                return null;
            case 1:
                List list = (List) obj;
                list.getClass();
                return Integer.valueOf(aqjn.U(list));
            case 2:
                ((Boolean) obj).booleanValue();
                return arnb.a;
            case 3:
                ((dho) obj).getClass();
                return arnb.a;
            case 4:
                ((Context) obj).getClass();
                return arnb.a;
            case 5:
                ((WebView) obj).getClass();
                return arnb.a;
            case 6:
                ((WebView) obj).getClass();
                return arnb.a;
            case 7:
                Context context = (Context) obj;
                context.getClass();
                return new WebView(context);
            case 8:
                Class cls = (Class) obj;
                cls.getClass();
                return cls.asSubclass(afcq.class);
            case 9:
                ((dho) obj).getClass();
                return arnb.a;
            case 10:
                ((dho) obj).getClass();
                return arnb.a;
            case 11:
                aftr aftrVar = (aftr) obj;
                aftrVar.getClass();
                return aftrVar.i();
            case 12:
                ((dho) obj).getClass();
                return arnb.a;
            case 13:
                afit afitVar = (afit) obj;
                afitVar.getClass();
                afitVar.a();
                return arnb.a;
            case 14:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                afri afriVar2 = (afri) afri.a.a();
                if (true != booleanValue) {
                    afriVar = afriVar2;
                }
                return new afvo(afriVar, 2);
            case 15:
                return ((afjz) obj).a;
            case 16:
                afjo afjoVar = (afjo) obj;
                afjoVar.getClass();
                if (afjoVar.b <= 0.0d) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 17:
                ajgi ajgiVar = (ajgi) obj;
                ajgiVar.getClass();
                ajgiVar.x(R.string.enable_permissions_app_settings_prompt_title);
                return arnb.a;
            case 18:
                cg cgVar = (cg) obj;
                cgVar.getClass();
                return cgVar.E;
            case 19:
                List list2 = (List) obj;
                list2.getClass();
                return list2;
            default:
                afjo afjoVar2 = (afjo) obj;
                afjoVar2.getClass();
                return ((afnb) afjoVar2.a).a().a().toString();
        }
    }
}
