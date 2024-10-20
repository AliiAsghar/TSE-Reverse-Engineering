package defpackage;

import android.util.Size;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;
import com.google.android.material.button.MaterialButton;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class afio extends no {
    public final arqg c;
    public arqr d;
    private final afhv e;
    private final arqr f;

    public afio(afhv afhvVar, arqg arqgVar, arqr arqrVar) {
        this.e = afhvVar;
        this.c = arqgVar;
        this.f = arqrVar;
    }

    @Override // defpackage.no
    public final int b() {
        return 1;
    }

    @Override // defpackage.no
    public final int c(int i) {
        return 3;
    }

    @Override // defpackage.no
    public final /* bridge */ /* synthetic */ oo e(ViewGroup viewGroup, int i) {
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.folders_button, viewGroup, false);
        inflate.getClass();
        return new airo(this, inflate);
    }

    @Override // defpackage.no
    public final /* bridge */ /* synthetic */ void g(oo ooVar, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        airo airoVar = (airo) ooVar;
        airoVar.getClass();
        Size a = this.e.a(3);
        no noVar = airoVar.s;
        acah acahVar = new acah(noVar, 11);
        View view = airoVar.t;
        MaterialButton materialButton = (MaterialButton) view;
        materialButton.setOnClickListener(acahVar);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            if (a != null) {
                i2 = a.getWidth();
            } else {
                i2 = -1;
            }
            layoutParams.width = i2;
            if (a != null) {
                i3 = a.getHeight();
            } else {
                i3 = -2;
            }
            layoutParams.height = i3;
            view.setLayoutParams(layoutParams);
            int i6 = 0;
            if (a != null) {
                i4 = a.getWidth();
            } else {
                i4 = 0;
            }
            if (a != null) {
                i6 = a.getHeight();
            }
            if (i4 > i6) {
                i5 = 2;
            } else {
                i5 = 32;
            }
            if (materialButton.f != i5) {
                materialButton.f = i5;
                materialButton.h(materialButton.getMeasuredWidth(), materialButton.getMeasuredHeight());
            }
            arqr arqrVar = ((afio) noVar).d;
            if (arqrVar != null) {
                arqrVar.a(airoVar.t);
                return;
            }
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
    }

    @Override // defpackage.no
    public final /* bridge */ /* synthetic */ void gH(oo ooVar) {
        ((airo) ooVar).getClass();
        this.f.a(true);
    }

    @Override // defpackage.no
    public final /* bridge */ /* synthetic */ void j(oo ooVar) {
        ((airo) ooVar).getClass();
        this.f.a(false);
    }
}
