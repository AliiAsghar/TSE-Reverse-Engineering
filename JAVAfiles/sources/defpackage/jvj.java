package defpackage;

import android.view.View;
import com.google.android.apps.messaging.R;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jvj implements juv {
    private final armf b;
    private final afxb c;
    private final /* synthetic */ int d;

    public jvj(armf armfVar, Map map, int i, byte[] bArr) {
        this.d = i;
        armfVar.getClass();
        this.b = armfVar;
        this.c = new afxb(R.drawable.gifs_shortcut_icon, new afxa(hwr.ac(R.color.gifs_shortcut_background, map), new agei(R.color.gifs_shortcut_icon_tint)));
    }

    @Override // defpackage.juv
    public final int a() {
        if (this.d != 0) {
            return R.string.gifs_shortcut_title;
        }
        return R.string.stickers_shortcut_title;
    }

    @Override // defpackage.juv
    public final afxb b() {
        if (this.d != 0) {
            return this.c;
        }
        return this.c;
    }

    @Override // defpackage.juv
    public final /* synthetic */ List c() {
        if (this.d != 0) {
            return arnv.a;
        }
        return arnv.a;
    }

    @Override // defpackage.juv
    public final void d(View view) {
        if (this.d != 0) {
            ((jhj) this.b.b()).b(new jhg(jhd.b, 2));
        } else {
            ((jhj) this.b.b()).b(new jhg(jhd.c, 2));
        }
    }

    @Override // defpackage.juv
    public final boolean e() {
        if (this.d != 0) {
            if (((Boolean) ipe.c.e()).booleanValue() && ipe.b()) {
                return true;
            }
            return false;
        }
        if (((Boolean) ipe.c.e()).booleanValue() && ipe.c()) {
            return true;
        }
        return false;
    }

    public jvj(armf armfVar, Map map, int i) {
        this.d = i;
        armfVar.getClass();
        this.b = armfVar;
        this.c = new afxb(R.drawable.quantum_gm_ic_sticker_vd_theme_24, new afxa(hwr.ac(R.color.stickers_shortcut_background, map), new agei(R.color.stickers_shortcut_icon_tint)));
    }
}
