package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.support.v7.widget.AppCompatImageView;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import j$.util.Objects;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kyu implements kzy {
    xvy a;
    xvy b;
    private final Context c;
    private final Resources d;
    private final xnv e;
    private final armf f;
    private final armf g;

    public kyu(Context context, xnv xnvVar, armf armfVar, armf armfVar2) {
        this.c = context;
        this.d = context.getResources();
        this.e = xnvVar;
        this.f = armfVar;
        this.g = armfVar2;
    }

    private final boolean f(kzd kzdVar) {
        long longValue;
        if (kzdVar.X.isEmpty()) {
            longValue = 0;
        } else {
            longValue = ((Long) kzdVar.X.get()).longValue();
        }
        if (longValue != 0 && this.e.f().toEpochMilli() - longValue > ((Long) uyh.g.e()).longValue()) {
            return true;
        }
        return false;
    }

    @Override // defpackage.kzy
    public final void b(kzx kzxVar, boolean z) {
        if (kzxVar.e != null) {
            TextView textView = (TextView) this.a.b();
            textView.setVisibility(0);
            textView.setText(kzxVar.e);
            Context context = this.c;
            Integer num = kzxVar.f;
            num.getClass();
            textView.setTextColor(ahnz.f(context, num.intValue(), "StatusViewPart"));
            return;
        }
        if (((ohf) this.g.b()).a() && kzxVar.ab != null) {
            AppCompatImageView appCompatImageView = (AppCompatImageView) this.b.b();
            if (appCompatImageView != null) {
                this.b.g(0);
                appCompatImageView.setImageDrawable(this.c.getDrawable(R.drawable.message_status_error));
                return;
            }
            return;
        }
        if (kzxVar.Y != null) {
            AppCompatImageView appCompatImageView2 = (AppCompatImageView) this.b.b();
            if (appCompatImageView2 != null) {
                this.b.g(0);
                Context context2 = this.c;
                Integer num2 = kzxVar.Y;
                num2.getClass();
                appCompatImageView2.setImageDrawable(context2.getDrawable(num2.intValue()));
                return;
            }
            return;
        }
        this.b.g(8);
    }

    @Override // defpackage.kzy
    public final void c(View view) {
        this.a = new xvy(view, R.id.conversation_status, R.id.conversation_status);
        this.b = new xvy(view, R.id.conversation_status_icon, R.id.conversation_status_icon);
    }

    @Override // defpackage.kzy
    public final boolean d(kzx kzxVar, kzx kzxVar2) {
        boolean z;
        if (ofn.a() && kzxVar.a.ac != kzxVar2.a.ac) {
            z = true;
        } else {
            z = false;
        }
        boolean z2 = kzxVar.a.G;
        boolean z3 = kzxVar2.a.G;
        if (TextUtils.equals(kzxVar2.e, kzxVar.e) && Objects.equals(kzxVar.Y, kzxVar2.Y) && !z && z2 == z3 && (!((ohf) this.g.b()).a() || Objects.equals(kzxVar2.ab, kzxVar.ab))) {
            return false;
        }
        return true;
    }

    @Override // defpackage.kzy
    public final void e(kzw kzwVar, kzd kzdVar) {
        Integer num = null;
        if (!kzdVar.G) {
            if (lga.H(kzdVar.R)) {
                kzwVar.f = Integer.valueOf(R.attr.colorErrorVariant);
                uyf uyfVar = kzdVar.W;
                if (uyfVar == uyf.LIGHTER_CONVERSATION_STATUS_FAILED_TO_DELETE) {
                    kzwVar.e = this.d.getString(R.string.conversation_deletion_failed_message);
                    return;
                }
                if (uyfVar == uyf.LIGHTER_CONVERSATION_STATUS_FAILED_TO_BLOCK) {
                    kzwVar.e = this.d.getString(R.string.conversation_block_failed_message);
                    return;
                }
                if (uyfVar == uyf.LIGHTER_CONVERSATION_STATUS_PENDING_TO_DELETE) {
                    if (f(kzdVar)) {
                        kzwVar.e = this.d.getString(R.string.conversation_deletion_failed_message);
                        return;
                    } else {
                        kzwVar.f = Integer.valueOf(R.attr.colorPrimary);
                        kzwVar.e = this.d.getString(R.string.conversation_deleting_message);
                        return;
                    }
                }
                if (uyfVar == uyf.LIGHTER_CONVERSATION_STATUS_PENDING_TO_BLOCK && kzdVar.a != tqc.BLOCKED_FOLDER) {
                    if (f(kzdVar)) {
                        kzwVar.e = this.d.getString(R.string.conversation_block_failed_message);
                        return;
                    } else {
                        kzwVar.f = Integer.valueOf(R.attr.colorPrimary);
                        kzwVar.e = this.d.getString(R.string.conversation_blocking_message);
                        return;
                    }
                }
                return;
            }
            kzwVar.f = Integer.valueOf(R.attr.colorOnSurface);
            int i = kzdVar.M;
            mmy mmyVar = kzdVar.ac;
            if (ofn.a() && mmyVar == mmy.c) {
                num = Integer.valueOf(R.drawable.unapproved_conversation_icon);
            } else if (rvx.m(i)) {
                num = Integer.valueOf(R.drawable.double_check_filled_scalable_v2);
            } else if (rvx.k(i)) {
                num = Integer.valueOf(R.drawable.double_check_outlined_scalable_v2);
            } else if (kyh.a.contains(Integer.valueOf(i))) {
                num = Integer.valueOf(R.drawable.message_status_error);
            }
        }
        kzwVar.O = num;
    }

    @Override // defpackage.kzy
    public final /* synthetic */ kzx a(kzx kzxVar) {
        return kzxVar;
    }
}
