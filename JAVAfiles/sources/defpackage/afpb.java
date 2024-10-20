package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import com.google.android.apps.messaging.R;
import com.google.android.libraries.inputmethod.emoji.picker.EmojiPickerBodyRecyclerView;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afpb extends afpi {
    private static final alvi ah = alvi.m("com/google/android/libraries/compose/emoji/ui/screen/gboard/GboardEmojiScreen");
    public algw a;
    public aiim ag;
    private final agek ai;
    private final arml aj;
    public afni b;
    public afmd c;
    public afxz d;
    public afxz e;

    public afpb() {
        super(new afnx(null, null, false, 511));
        this.ai = agek.b;
        this.aj = armd.a(new afoo(this, 6));
    }

    public final afpg a() {
        return (afpg) this.aj.a();
    }

    @Override // defpackage.agem
    public final agek aM() {
        return this.ai;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.agem
    public final void aT(afzr afzrVar) {
        ((alvg) ah.d().h("com/google/android/libraries/compose/emoji/ui/screen/gboard/GboardEmojiScreen", "applyHugoColors", 111, "GboardEmojiScreen.kt")).t("Applying HugoColors: %s", afzrVar);
        aiim aiimVar = this.ag;
        Object obj = null;
        if (aiimVar == null) {
            arro.b("views");
            aiimVar = null;
        }
        ((ImageButton) aiimVar.b).setImageTintList(afzrVar.k);
        ((ImageButton) aiimVar.b).setBackgroundColor(afzrVar.j);
        ((RecyclerView) aiimVar.d).setBackgroundColor(afzrVar.d);
        afpg a = a();
        Object obj2 = a.l;
        if (true == (obj2 instanceof agvz)) {
            obj = obj2;
        }
        if (obj != null) {
            ((agvz) obj).b(a.k);
        }
    }

    @Override // defpackage.cg
    public final void ag(View view, Bundle bundle) {
        int i;
        String str;
        view.getClass();
        aiim aiimVar = new aiim((ViewGroup) view);
        Object obj = aiimVar.b;
        int i2 = 8;
        if (true != ((afnx) bj()).e) {
            i = 8;
        } else {
            i = 0;
        }
        ((View) obj).setVisibility(i);
        int dimensionPixelSize = z().getDimensionPixelSize(R.dimen.emoji_tab_height);
        RecyclerView recyclerView = (RecyclerView) aiimVar.d;
        int paddingStart = recyclerView.getPaddingStart();
        int paddingTop = recyclerView.getPaddingTop();
        if (true != ((afnx) bj()).e) {
            dimensionPixelSize = 0;
        }
        recyclerView.setPaddingRelative(paddingStart, paddingTop, dimensionPixelSize, ((RecyclerView) aiimVar.d).getPaddingBottom());
        ((ImageButton) aiimVar.b).setOnClickListener(bh().a("GboardEmojiScreen.backspace#onClick", new acah(this, 13)));
        this.ag = aiimVar;
        Bundle bundle2 = this.m;
        if (bundle2 != null) {
            str = bundle2.getString("search");
        } else {
            str = null;
        }
        if (str == null) {
            afpg a = a();
            Object obj2 = a.l;
            if (!(obj2 instanceof agvz)) {
                aiim aiimVar2 = a.o;
                agvz agvzVar = new agvz((RecyclerView) aiimVar2.d, (EmojiPickerBodyRecyclerView) aiimVar2.c, a.n, (agwm) a.j.a(), (agwc) a.i.a());
                agvzVar.t = true;
                agvzVar.w.ag(agvzVar.d());
                agvzVar.k.ifPresent(new aavc(18));
                if (agvzVar.p.isEmpty()) {
                    agvzVar.x = new agwf(agvzVar.b, new evp(12), new ahjj(agvzVar), agvzVar.j, agvzVar.B);
                    agvzVar.v.ag(agvzVar.x);
                }
                a.l = agvzVar;
                obj2 = agvzVar;
            }
            ((agvz) obj2).b(a.k);
            aiim aiimVar3 = a.o;
            ((View) aiimVar3.d).setVisibility(0);
            if (true == a.h.e) {
                i2 = 0;
            }
            ((View) aiimVar3.b).setVisibility(i2);
            ((View) aiimVar3.a).setVisibility(0);
        }
        bs();
        by();
    }

    public final afmd d() {
        afmd afmdVar = this.c;
        if (afmdVar != null) {
            return afmdVar;
        }
        arro.b("definitionsService");
        return null;
    }

    @Override // defpackage.afpi, defpackage.agai, defpackage.cg
    public final void f(Context context) {
        super.f(context);
        bh().d("GboardEmojiScreen#onAttach", new afoo(this, 3));
    }

    @Override // defpackage.ageb
    public final agea r() {
        aiim aiimVar = this.ag;
        if (aiimVar != null) {
            return afzv.q((RecyclerView) aiimVar.c);
        }
        return null;
    }
}
