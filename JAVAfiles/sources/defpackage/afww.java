package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.libraries.compose.ui.composable.HugoHostFragment;
import j$.util.Optional;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afww extends arrp implements arqg {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public afww(Object obj, int i) {
        super(0);
        this.b = i;
        this.a = obj;
    }

    /* JADX WARN: Type inference failed for: r0v75, types: [apwt, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v78, types: [apwt, java.lang.Object] */
    @Override // defpackage.arqg
    public final /* synthetic */ Object a() {
        Optional optional = null;
        Optional optional2 = null;
        armf armfVar = null;
        Optional optional3 = null;
        int i = 0;
        r2 = false;
        boolean z = false;
        switch (this.b) {
            case 0:
                return (ImageView) ((afwx) this.a).s.findViewById(R.id.proxy_screen_search_row_end_icon);
            case 1:
                Drawable drawable = ((afwt) this.a).b.getDrawable(R.drawable.quantum_gm_ic_search_vd_theme_24);
                drawable.getClass();
                return drawable;
            case 2:
                return (ImageView) ((afwx) this.a).s.findViewById(R.id.proxy_screen_search_row_start_icon);
            case 3:
                return (TextView) ((afwx) this.a).s.findViewById(R.id.proxy_screen_search_row_text);
            case 4:
                final afwz afwzVar = (afwz) this.a;
                afjh afjhVar = new afjh() { // from class: afwy
                    @Override // defpackage.afjh
                    public final /* synthetic */ boolean a(Object obj, int i2, Object obj2) {
                        arro.b("userQuery");
                        ((afwx) obj).D(null, (afwu) afwz.this.f.get(i2));
                        return true;
                    }
                };
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                int i2 = arsc.a;
                aeke.by(new arrh(afwv.class), afjhVar, linkedHashMap);
                return aeke.bz(linkedHashMap);
            case 5:
                afxh afxhVar = (afxh) this.a;
                return afxhVar.bc().n(afxh.e(afxhVar), afxhVar.bb());
            case 6:
                afxh afxhVar2 = (afxh) this.a;
                return ascy.a(afxhVar2.bc().n(afxh.e(afxhVar2), afxhVar2.bb()));
            case 7:
                Optional optional4 = ((afxh) this.a).a;
                if (optional4 == null) {
                    arro.b("useUpdatedShortcutConfigurationOverride");
                } else {
                    optional = optional4;
                }
                return (Boolean) arsd.j(optional, false);
            case 8:
                Optional optional5 = ((afxh) this.a).b;
                if (optional5 == null) {
                    arro.b("useShortcutConfigurationFlow");
                } else {
                    optional3 = optional5;
                }
                return (Boolean) arsd.j(optional3, false);
            case 9:
                afxo afxoVar = (afxo) this.a;
                return Integer.valueOf(afxoVar.F() + ((Number) afxoVar.m.a()).intValue() + ((afxo) this.a).F());
            case 10:
                return Integer.valueOf(((afxo) this.a).d.getResources().getDimensionPixelSize(R.dimen.shortcut_icon_size));
            case 11:
                return Integer.valueOf(((afxo) this.a).d.getResources().getDimensionPixelSize(R.dimen.shortcut_cell_height));
            case 12:
                afxo afxoVar2 = (afxo) this.a;
                return Integer.valueOf(afxoVar2.F() + ((Number) afxoVar2.n.a()).intValue() + ((afxo) this.a).F());
            case 13:
                return Integer.valueOf(((afxo) this.a).d.getResources().getDimensionPixelSize(R.dimen.shortcut_spacing));
            case 14:
                return (Map) this.a.b();
            case 15:
                return (Map) this.a.b();
            case 16:
                if (((HugoHostFragment) this.a).e().f) {
                    armf armfVar2 = ((HugoHostFragment) this.a).e;
                    if (armfVar2 == null) {
                        arro.b("providedDraftController");
                    } else {
                        armfVar = armfVar2;
                    }
                    return (afkq) armfVar.b();
                }
                afkq afkqVar = ((HugoHostFragment) this.a).ag;
                if (afkqVar == null) {
                    arro.b("draftController");
                    return null;
                }
                return afkqVar;
            case 17:
                Context x = ((cg) this.a).x();
                if (x != null) {
                    i = ((Number) ((HugoHostFragment) this.a).ai.a(x)).intValue();
                }
                return Integer.valueOf(i);
            case 18:
                Optional optional6 = ((HugoHostFragment) this.a).d;
                if (optional6 == null) {
                    arro.b("optionalProvidedConfiguration");
                } else {
                    optional2 = optional6;
                }
                optional2.isPresent();
                return optional2.get();
            case 19:
                EditText editText = (EditText) ((czj) this.a).a;
                if (editText != null && editText.requestFocus()) {
                    z = true;
                }
                return Boolean.valueOf(z);
            default:
                return (arqr) ((afys) this.a).c.f();
        }
    }
}
