package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.telephony.SmsMessage;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aakb extends ArrayAdapter {
    final /* synthetic */ aakc a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aakb(aakc aakcVar, Context context, String[] strArr) {
        super(context, R.layout.sms_mms_dump_file_list_item, strArr);
        this.a = aakcVar;
    }

    @Override // android.widget.ArrayAdapter, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        TextView textView;
        if (view != null && (view instanceof TextView)) {
            textView = (TextView) view;
        } else {
            textView = (TextView) LayoutInflater.from(getContext()).inflate(R.layout.sms_mms_dump_file_list_item, viewGroup, false);
        }
        final String str = (String) getItem(i);
        textView.setText(str);
        textView.setOnClickListener(new View.OnClickListener() { // from class: aaka
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                long length;
                aakb aakbVar = aakb.this;
                aakbVar.a.d();
                String str2 = str;
                if (str2 != null) {
                    if ("load".equals(aakbVar.a.ah)) {
                        aakc aakcVar = aakbVar.a;
                        Context context = aakbVar.getContext();
                        if (str2.startsWith("smsdump-")) {
                            SmsMessage[] b = aakcVar.aj.b(str2);
                            if (b.length != 0) {
                                aakcVar.ai.a(null, aakcVar.fe(), -1, 0, b, 0L);
                                return;
                            } else {
                                xzb.g("Bugle", "receiveFromDumpFile: invalid sms dump file ".concat(str2));
                                return;
                            }
                        }
                        if (str2.startsWith("mmsdump-")) {
                            wyq wyqVar = aakcVar.ak;
                            byte[] bArr = null;
                            try {
                                byte[] s = wyqVar.c.s(str2, context);
                                gt a = wyq.a(s);
                                gj gjVar = new gj((char[]) null);
                                long epochMilli = (wyqVar.b.f().toEpochMilli() / 1000) + 600;
                                gjVar.a.j(str2.getBytes(), 152);
                                gjVar.d(a.a.a(141));
                                gjVar.b(a.a.c(137));
                                gjVar.a.g(a.a.c(150), 150);
                                gjVar.a.h(epochMilli, 136);
                                if (s == null) {
                                    length = 0;
                                } else {
                                    length = s.length;
                                }
                                gjVar.a.h(length, 142);
                                gjVar.a.j(a.a.k(138), 138);
                                Uri.Builder scheme = new Uri.Builder().authority(uho.b(wyqVar.a)).scheme("content");
                                scheme.appendPath(str2);
                                gjVar.e(scheme.build().toString().getBytes());
                                bArr = new vao(wyqVar.a, gjVar).b();
                            } catch (gk | wyr unused) {
                            }
                            if (bArr == null || bArr.length <= 0) {
                                throw new IllegalArgumentException("Empty or zero length PDU data");
                            }
                            byte[] bArr2 = bArr;
                            if (bArr2 != null) {
                                aakcVar.am.a(-1, bArr2, 0L, 0, 0).t();
                                return;
                            } else {
                                xzb.g("Bugle", "receiveFromDumpFile: invalid mms dump file ".concat(str2));
                                return;
                            }
                        }
                        xzb.g("Bugle", "receiveFromDumpFile: invalid dump file name ".concat(str2));
                        return;
                    }
                    if ("email".equals(aakbVar.a.ah)) {
                        aakc aakcVar2 = aakbVar.a;
                        Resources z = aakcVar2.z();
                        Context x = aakcVar2.x();
                        if (x != null) {
                            File a2 = ((yck) aakcVar2.al.b()).a(str2, false, x);
                            File e = uti.e(x, a2.getName());
                            try {
                                BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(a2));
                                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(e));
                                ajki.w(bufferedInputStream, bufferedOutputStream);
                                bufferedInputStream.close();
                                bufferedOutputStream.close();
                            } catch (IOException e2) {
                                ((alvg) ((alvg) ((alvg) aakc.ag.h()).g(e2)).h("com/google/android/apps/messaging/ui/debug/DebugSmsMmsFromDumpFileDialogFragment", "emailDumpFile", (char) 207, "DebugSmsMmsFromDumpFileDialogFragment.java")).q("emailDumpFile: failed to copy dump file for sharing");
                            }
                            Uri d = uti.d(x, a2.getName());
                            Intent intent = new Intent("android.intent.action.SEND");
                            intent.setType("application/octet-stream");
                            intent.putExtra("android.intent.extra.STREAM", d);
                            intent.putExtra("android.intent.extra.SUBJECT", z.getString(R.string.email_sms_mms_dump_file_subject));
                            intent.putExtra("extra_subject_mandatory", true);
                            intent.setFlags(1);
                            aakcVar2.fe().startActivity(Intent.createChooser(intent, z.getString(R.string.email_sms_mms_dump_file_chooser_title)));
                            return;
                        }
                        throw new IllegalStateException("Context cannot be null.");
                    }
                }
            }
        });
        return textView;
    }
}
