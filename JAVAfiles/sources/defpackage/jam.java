package defpackage;

import android.content.Context;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.RadioButton;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.conversation.simpicker.SimIconView;
import java.util.Arrays;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class jam extends ArrayAdapter {
    public int a;
    private final xwr b;
    private final msk c;
    private final List d;

    public jam(xwr xwrVar, msk mskVar, Context context, List list) {
        super(context, R.layout.sim_picker_dialog_row, list);
        this.b = xwrVar;
        this.c = mskVar;
        this.d = list;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        boolean z;
        int ba;
        viewGroup.getClass();
        qwm qwmVar = (qwm) this.d.get(i);
        if (view == null) {
            view = LayoutInflater.from(getContext()).inflate(R.layout.sim_picker_dialog_row, viewGroup, false);
        }
        RadioButton radioButton = (RadioButton) view.findViewById(R.id.option_radio_button);
        if (i == this.a) {
            z = true;
        } else {
            z = false;
        }
        radioButton.setChecked(z);
        ((TextView) view.findViewById(R.id.name)).setText(getContext().getString(R.string.sim_dialog_picker_row_text, qwmVar.h(), Integer.valueOf(qwmVar.c())));
        msh mshVar = (msh) qwmVar.b().orElse(null);
        TextView textView = (TextView) view.findViewById(R.id.details);
        if (mshVar != null) {
            textView.setVisibility(0);
            textView.setText(this.b.a(this.c.t(mshVar.G(true).a, qwmVar.e())));
        } else {
            textView.setVisibility(8);
        }
        SimIconView simIconView = (SimIconView) view.findViewById(R.id.sim_icon);
        String format = String.format(yhx.b(getContext()), "%d", Arrays.copyOf(new Object[]{Integer.valueOf(qwmVar.c())}, 1));
        format.getClass();
        if (qwmVar.f() == 0) {
            ba = getContext().getColor(R.color.sim_icon_text_color);
        } else {
            Context context = getContext();
            context.getClass();
            ba = adom.ba(context, qwmVar.f());
        }
        Uri t = xvc.t(getContext(), format, false, ba);
        t.getClass();
        Context context2 = simIconView.getContext();
        context2.getClass();
        simIconView.j(t, yzc.q(context2));
        simIconView.h(false);
        view.getClass();
        return view;
    }
}
