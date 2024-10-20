package defpackage;

import android.content.Intent;
import android.support.v7.widget.SearchView;
import android.view.View;
import android.widget.AdapterView;
import com.google.android.libraries.social.licenses.LicenseActivity;
import com.google.android.libraries.social.licenses.LicenseMenuActivity;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class ov implements AdapterView.OnItemClickListener {
    final /* synthetic */ Object a;
    private final /* synthetic */ int b;

    public ov(Object obj, int i) {
        this.b = i;
        this.a = obj;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        Object item;
        CharSequence convertSelectionToString;
        int i2 = this.b;
        if (i2 != 0) {
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 != 3) {
                        if (i < 0) {
                            nd ndVar = ((ajnh) this.a).a;
                            if (!ndVar.u()) {
                                item = null;
                            } else {
                                item = ndVar.e.getSelectedItem();
                            }
                        } else {
                            item = ((ajnh) this.a).getAdapter().getItem(i);
                        }
                        ajnh ajnhVar = (ajnh) this.a;
                        convertSelectionToString = ajnhVar.convertSelectionToString(item);
                        ajnhVar.setText(convertSelectionToString, false);
                        AdapterView.OnItemClickListener onItemClickListener = ((ajnh) this.a).getOnItemClickListener();
                        if (onItemClickListener != null) {
                            if (view == null || i < 0) {
                                nd ndVar2 = ((ajnh) this.a).a;
                                if (!ndVar2.u()) {
                                    view = null;
                                } else {
                                    view = ndVar2.e.getSelectedView();
                                }
                                nd ndVar3 = ((ajnh) this.a).a;
                                i = ndVar3.o();
                                if (!ndVar3.u()) {
                                    j = Long.MIN_VALUE;
                                } else {
                                    j = ndVar3.e.getSelectedItemId();
                                }
                            }
                            onItemClickListener.onItemClick(((ajnh) this.a).a.e, view, i, j);
                        }
                        ((ajnh) this.a).a.k();
                        return;
                    }
                    aiqb aiqbVar = (aiqb) adapterView.getItemAtPosition(i);
                    LicenseMenuActivity licenseMenuActivity = ((aiqd) this.a).a;
                    if (licenseMenuActivity != null) {
                        Intent intent = new Intent(licenseMenuActivity, (Class<?>) LicenseActivity.class);
                        intent.putExtra("license", aiqbVar);
                        licenseMenuActivity.startActivity(intent);
                        return;
                    }
                    return;
                }
                kto ktoVar = (kto) this.a;
                ktoVar.c((ktd) ktoVar.x.c().get(i));
                return;
            }
            ((la) this.a).d.setSelection(i);
            if (((la) this.a).d.getOnItemClickListener() != null) {
                la laVar = (la) this.a;
                laVar.d.performItemClick(view, i, laVar.b.getItemId(i));
            }
            ((nd) this.a).k();
            return;
        }
        ((SearchView) this.a).onItemClicked(i, 0, null);
    }

    public /* synthetic */ ov(Object obj, int i, byte[] bArr) {
        this.b = i;
        this.a = obj;
    }
}
