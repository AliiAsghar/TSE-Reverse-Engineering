package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.window.sidecar.SidecarDisplayFeature;
import com.google.android.apps.messaging.R;
import java.io.File;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class rp extends arrp implements arqr {
    private final /* synthetic */ int v;
    public static final rp u = new rp(20);
    public static final rp t = new rp(19);
    public static final rp s = new rp(18);
    public static final rp r = new rp(17);
    public static final rp q = new rp(16);
    public static final rp p = new rp(15);
    public static final rp o = new rp(14);
    public static final rp n = new rp(13);
    public static final rp m = new rp(12);
    public static final rp l = new rp(11);
    public static final rp k = new rp(10);
    public static final rp j = new rp(9);
    public static final rp i = new rp(8);
    public static final rp h = new rp(7);
    public static final rp g = new rp(6);
    public static final rp f = new rp(5);
    public static final rp e = new rp(4);
    public static final rp d = new rp(3);
    public static final rp c = new rp(2);
    public static final rp b = new rp(1);
    public static final rp a = new rp(0);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rp(int i2) {
        super(1);
        this.v = i2;
    }

    @Override // defpackage.arqr
    public final /* synthetic */ Object a(Object obj) {
        ViewGroup viewGroup;
        boolean z = false;
        switch (this.v) {
            case 0:
                View view = (View) obj;
                view.getClass();
                Object tag = view.getTag(R.id.view_tree_on_back_pressed_dispatcher_owner);
                if (!(tag instanceof ro)) {
                    return null;
                }
                return (ro) tag;
            case 1:
                return a.w((View) obj);
            case 2:
                obj.getClass();
                return null;
            case 3:
                View view2 = (View) obj;
                if (view2 instanceof ViewGroup) {
                    viewGroup = (ViewGroup) view2;
                } else {
                    viewGroup = null;
                }
                if (viewGroup == null) {
                    return null;
                }
                return new een(viewGroup, 1).a();
            case 4:
                File file = (File) obj;
                file.getClass();
                file.getCanonicalFile().getAbsolutePath().getClass();
                return new kkc((byte[]) null, (byte[]) null, (byte[]) null);
            case 5:
                return a.w((View) obj);
            case 6:
                View view3 = (View) obj;
                view3.getClass();
                Object tag2 = view3.getTag(R.id.view_tree_view_model_store_owner);
                if (!(tag2 instanceof eoz)) {
                    return null;
                }
                return (eoz) tag2;
            case 7:
                fzy fzyVar = (fzy) obj;
                fzyVar.getClass();
                fzyVar.a();
                return arnb.a;
            case 8:
                return ghw.k(obj);
            case 9:
                return ghw.k(obj);
            case 10:
                return ghw.k(obj);
            case 11:
                arqg arqgVar = (arqg) obj;
                arqgVar.getClass();
                arqgVar.a();
                return arnb.a;
            case 12:
                gkb gkbVar = (gkb) obj;
                gkbVar.getClass();
                return Boolean.valueOf(gkbVar.h());
            case 13:
                gkb gkbVar2 = (gkb) obj;
                gkbVar2.getClass();
                aroy aroyVar = new aroy();
                while (gkbVar2.h()) {
                    aroyVar.add(Integer.valueOf((int) gkbVar2.b(0)));
                }
                return aqjn.d(aroyVar);
            case 14:
                return a.w((View) obj);
            case 15:
                View view4 = (View) obj;
                view4.getClass();
                Object tag3 = view4.getTag(R.id.view_tree_saved_state_registry_owner);
                if (!(tag3 instanceof gjz)) {
                    return null;
                }
                return (gjz) tag3;
            case 16:
                gpo gpoVar = (gpo) obj;
                gpoVar.getClass();
                return gpoVar;
            case 17:
                SidecarDisplayFeature sidecarDisplayFeature = (SidecarDisplayFeature) obj;
                sidecarDisplayFeature.getClass();
                if (sidecarDisplayFeature.getType() == 1 || sidecarDisplayFeature.getType() == 2) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 18:
                SidecarDisplayFeature sidecarDisplayFeature2 = (SidecarDisplayFeature) obj;
                sidecarDisplayFeature2.getClass();
                if (sidecarDisplayFeature2.getRect().width() != 0 || sidecarDisplayFeature2.getRect().height() != 0) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 19:
                SidecarDisplayFeature sidecarDisplayFeature3 = (SidecarDisplayFeature) obj;
                sidecarDisplayFeature3.getClass();
                if (sidecarDisplayFeature3.getType() != 1 || sidecarDisplayFeature3.getRect().width() == 0 || sidecarDisplayFeature3.getRect().height() == 0) {
                    z = true;
                }
                return Boolean.valueOf(z);
            default:
                SidecarDisplayFeature sidecarDisplayFeature4 = (SidecarDisplayFeature) obj;
                sidecarDisplayFeature4.getClass();
                if (sidecarDisplayFeature4.getRect().left == 0 || sidecarDisplayFeature4.getRect().top == 0) {
                    z = true;
                }
                return Boolean.valueOf(z);
        }
    }
}
