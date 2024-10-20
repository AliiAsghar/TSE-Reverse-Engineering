package defpackage;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.Property;
import android.widget.ImageView;
import com.google.android.apps.messaging.R;
import java.util.function.BiConsumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zqo {
    public Runnable a;
    public Runnable b;
    public zqm c;
    final /* synthetic */ ImageView d;
    final /* synthetic */ zpn e;
    final /* synthetic */ zqn f;
    final /* synthetic */ zqn g;
    final /* synthetic */ zqn h;
    private final BiConsumer i;

    public zqo(BiConsumer biConsumer, zqm zqmVar, ImageView imageView, zpn zpnVar, zqn zqnVar, zqn zqnVar2, zqn zqnVar3) {
        this.d = imageView;
        this.e = zpnVar;
        this.f = zqnVar;
        this.g = zqnVar2;
        this.h = zqnVar3;
        this.c = zqmVar;
        this.i = biConsumer;
        c(zqmVar);
    }

    public final void a(Runnable runnable, Runnable runnable2) {
        this.a = runnable;
        this.b = runnable2;
    }

    public final void b(zqm zqmVar) {
        ImageView imageView = this.d;
        xzb.l("SimpleIcons", "Button " + imageView.getResources().getResourceEntryName(imageView.getId()) + " got state set to " + String.valueOf(zqmVar) + ". Current was " + String.valueOf(this.c));
        if (this.c != zqmVar) {
            c(zqmVar);
            this.c = zqmVar;
            this.i.accept(this, zqmVar);
        }
    }

    public final void c(zqm zqmVar) {
        zqn zqnVar;
        int i;
        int ordinal = zqmVar.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal == 2) {
                    zqnVar = this.h;
                } else {
                    throw new IllegalStateException("Unhandled state ".concat(String.valueOf(String.valueOf(zqmVar))));
                }
            } else {
                zqnVar = this.g;
            }
        } else {
            zqnVar = this.f;
        }
        zpn zpnVar = this.e;
        Property property = zsc.b;
        if (zqmVar == zqm.OPEN) {
            i = 10000;
        } else {
            i = 0;
        }
        ObjectAnimator duration = ObjectAnimator.ofInt(zpnVar, (Property<zpn, Integer>) property, i).setDuration(250L);
        duration.setInterpolator(new emq());
        duration.start();
        this.d.setColorFilter(zqnVar.b);
        ImageView imageView = this.d;
        Context context = imageView.getContext();
        if (zqnVar.e == null) {
            zqnVar.e = context.getString(zqnVar.c);
        }
        imageView.setContentDescription(zqnVar.e);
        Integer num = zqnVar.d;
        if (num != null) {
            ImageView imageView2 = this.d;
            num.intValue();
            imageView2.setBackgroundResource(R.drawable.compose_audio_button_selected_background);
            return;
        }
        this.d.setBackground(null);
    }
}
