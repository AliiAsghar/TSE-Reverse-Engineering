package defpackage;

import android.content.Context;
import android.util.Log;
import com.google.android.libraries.compose.ui.rendering.container.RendererContainer;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class agdl extends arrp implements arqr {
    private final /* synthetic */ int u;
    public static final agdl t = new agdl(20);
    public static final agdl s = new agdl(19);
    public static final agdl r = new agdl(18);
    public static final agdl q = new agdl(17);
    public static final agdl p = new agdl(16);
    public static final agdl o = new agdl(15);
    public static final agdl n = new agdl(14);
    public static final agdl m = new agdl(13);
    public static final agdl l = new agdl(12);
    public static final agdl k = new agdl(11);
    public static final agdl j = new agdl(10);
    public static final agdl i = new agdl(9);
    public static final agdl h = new agdl(8);
    public static final agdl g = new agdl(6);
    public static final agdl f = new agdl(5);
    public static final agdl e = new agdl(4);
    public static final agdl d = new agdl(3);
    public static final agdl c = new agdl(2);
    public static final agdl b = new agdl(1);
    public static final agdl a = new agdl(0);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public agdl(int i2) {
        super(1);
        this.u = i2;
    }

    @Override // defpackage.arqr
    public final /* synthetic */ Object a(Object obj) {
        switch (this.u) {
            case 0:
                ((afkq) obj).getClass();
                return 0;
            case 1:
                ((afkq) obj).getClass();
                return 0;
            case 2:
                List list = (List) obj;
                list.getClass();
                Object X = aqjn.X(list);
                X.getClass();
                Object ac = aqjn.ac(list);
                ac.getClass();
                return Float.valueOf(r6.b / (((float) (((agdv) ac).a - ((agdv) X).a)) / 1000.0f));
            case 3:
                agdz agdzVar = (agdz) obj;
                agdzVar.getClass();
                return new agdw(agdzVar);
            case 4:
                if (true != (obj instanceof RendererContainer)) {
                    obj = null;
                }
                return (RendererContainer) obj;
            case 5:
                ((Context) obj).getClass();
                return 0;
            case 6:
                dty dtyVar = (dty) obj;
                dtyVar.getClass();
                ef.w(dtyVar.g, dtyVar.c.d, 24.0f, 4);
                ef.x(dtyVar.h, dtyVar.c.c);
                ef.x(dtyVar.i, dtyVar.c.e);
                return arnb.a;
            case 7:
                ((agja) obj).getClass();
                throw null;
            case 8:
                ((aggp) obj).getClass();
                return arnb.a;
            case 9:
                ((diy) obj).getClass();
                return arnb.a;
            case 10:
                ((diy) obj).getClass();
                return arnb.a;
            case 11:
                akec akecVar = (akec) obj;
                akecVar.getClass();
                return Boolean.valueOf(akecVar instanceof akeg);
            case 12:
                ((Exception) obj).getClass();
                return null;
            case 13:
                String str = (String) obj;
                str.getClass();
                return str;
            case 14:
                abrn abrnVar = (abrn) obj;
                abrnVar.getClass();
                return Integer.valueOf(Log.w("ConfigurationUpdater", "Failed to update shared storage snapshot. GMS Core version too old.", abrnVar));
            case 15:
                ahty ahtyVar = (ahty) obj;
                ahtyVar.getClass();
                if (ahtyVar.a == 29501) {
                    return null;
                }
                throw ahtyVar;
            case 16:
                akix akixVar = (akix) obj;
                akixVar.getClass();
                return akixVar.a().c;
            case 17:
                abrn abrnVar2 = (abrn) obj;
                abrnVar2.getClass();
                return Integer.valueOf(Log.w("RegisterInternal", "GMS Core version too old", abrnVar2));
            case 18:
                aocw aocwVar = (aocw) obj;
                aocwVar.getClass();
                return aocwVar.g;
            case 19:
                abrn abrnVar3 = (abrn) obj;
                abrnVar3.getClass();
                return Integer.valueOf(Log.w("ConfigurationUpdater", "Failed to update shared storage snapshot", abrnVar3));
            default:
                ((Exception) obj).getClass();
                return false;
        }
    }
}
