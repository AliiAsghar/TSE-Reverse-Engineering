package defpackage;

import android.view.View;
import android.widget.TextView;
import com.google.android.apps.messaging.ui.mediapicker.c2o.content.AttachmentQueueState;
import com.google.android.apps.messaging.ui.mediapicker.c2o.selectable.SelectableContentItemView;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class aaum implements aapw {
    public final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public aaum(aarm aarmVar, int i) {
        this.b = i;
        this.a = aarmVar;
    }

    @Override // defpackage.aapw
    public final void d(AttachmentQueueState attachmentQueueState) {
        List<View> t;
        int c;
        boolean k;
        TextView textView;
        imv imvVar;
        if (this.b != 0) {
            if (((Boolean) aarw.a.e()).booleanValue()) {
                ((aarm) this.a).u.b();
                return;
            } else {
                ((aarm) this.a).c();
                return;
            }
        }
        aaqp aaqpVar = ((aaun) this.a).d;
        if (aaqpVar != null && (t = aaqpVar.t()) != null) {
            for (View view : t) {
                if (view instanceof SelectableContentItemView) {
                    SelectableContentItemView selectableContentItemView = (SelectableContentItemView) view;
                    if (((Boolean) utw.o.e()).booleanValue() && (imvVar = selectableContentItemView.h) != null) {
                        c = attachmentQueueState.b(imvVar);
                        k = attachmentQueueState.j(selectableContentItemView.h);
                    } else {
                        c = attachmentQueueState.c(selectableContentItemView.g);
                        k = attachmentQueueState.k(selectableContentItemView.g);
                    }
                    selectableContentItemView.l = c;
                    if (c != -1 && (textView = selectableContentItemView.e) != null) {
                        textView.setText(Integer.toString(c + 1));
                    }
                    if (selectableContentItemView.k != k) {
                        selectableContentItemView.k = k;
                        TextView textView2 = selectableContentItemView.e;
                        if (textView2 != null && selectableContentItemView.f != null) {
                            textView2.clearAnimation();
                            if (selectableContentItemView.k) {
                                selectableContentItemView.d.n(selectableContentItemView, 0.88f);
                                selectableContentItemView.d.k(selectableContentItemView.e, 0, null);
                                selectableContentItemView.d.h(selectableContentItemView.f, selectableContentItemView.i, selectableContentItemView.j);
                            } else {
                                selectableContentItemView.d.n(selectableContentItemView, 1.0f);
                                selectableContentItemView.d.k(selectableContentItemView.e, 8, new aaqk(selectableContentItemView, 8));
                                selectableContentItemView.d.h(selectableContentItemView.f, selectableContentItemView.j, selectableContentItemView.i);
                            }
                        }
                    }
                }
            }
        }
    }

    public /* synthetic */ aaum(aaun aaunVar, int i) {
        this.b = i;
        this.a = aaunVar;
    }

    @Override // defpackage.aapw
    public final /* synthetic */ void h() {
    }
}
