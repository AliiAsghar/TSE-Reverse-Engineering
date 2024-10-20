package com.google.android.apps.messaging.voiceactions;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import defpackage.abdj;
import defpackage.ajtz;
import defpackage.ibi;
import defpackage.qrl;
import defpackage.rio;
import defpackage.rrb;
import defpackage.rrc;
import defpackage.rsx;
import defpackage.rsy;
import defpackage.ruy;
import defpackage.rxn;
import defpackage.yyb;
import defpackage.zas;
import j$.util.Optional;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class BugleSearchActionVerificationClientService extends ajtz {
    private boolean c = false;
    private boolean d = true;
    private boolean e = false;
    private boolean f = false;

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public interface a {
        zas PS();
    }

    /* JADX WARN: Type inference failed for: r13v3, types: [armf, java.lang.Object] */
    @Override // defpackage.ajtz
    public final void a(Intent intent, boolean z) {
        String action;
        if (z) {
            if (intent != null && intent.getAction() != null && ((action = intent.getAction()) == null || !action.equals("com.google.android.voicesearch.SEND_MESSAGE_TO_CONTACTS"))) {
                throw new IllegalArgumentException("Invalid action.");
            }
            Intent intent2 = new Intent(intent);
            String stringExtra = intent2.getStringExtra("android.intent.extra.REFERRER_NAME");
            if (!TextUtils.isEmpty(stringExtra)) {
                if (stringExtra != null && !stringExtra.equals("android-app://com.google.android.googlequicksearchbox/https/www.google.com")) {
                    throw new IllegalArgumentException("Invalid referer.");
                }
                String stringExtra2 = intent2.getStringExtra("com.google.android.voicesearch.extra.RECIPIENT_CONTACT_CHAT_ID");
                ConversationIdType b = ruy.b(intent2.getStringExtra("com.google.android.voicesearch.extra.RECIPIENT_CONVERSATION_ID"));
                if (TextUtils.isEmpty(stringExtra2) && b.b()) {
                    throw new IllegalArgumentException("Invalid recipient.");
                }
                if (intent2.hasExtra("EXPECT_EXTERNAL_APP_UI")) {
                    this.c = intent2.getBooleanExtra("EXPECT_EXTERNAL_APP_UI", true);
                }
                if (intent2.hasExtra("EXPECT_EXTERNAL_CONFIRMATION")) {
                    this.d = intent2.getBooleanExtra("EXPECT_EXTERNAL_CONFIRMATION", true);
                }
                if (intent2.hasExtra("android.intent.extra.STREAM")) {
                    this.e = true;
                }
                if (intent2.hasExtra("FOCUS_ON_FIELD") && "message.text".equals(intent2.getStringExtra("FOCUS_ON_FIELD"))) {
                    this.f = true;
                }
                intent2.replaceExtras((Bundle) null);
                if (intent.hasExtra("android.intent.extra.SUBJECT")) {
                    intent2.putExtra("android.intent.extra.SUBJECT", intent.getStringExtra("android.intent.extra.SUBJECT"));
                }
                if (intent.hasExtra("extra_subject_mandatory")) {
                    intent2.putExtra("extra_subject_mandatory", intent.getBooleanExtra("extra_subject_mandatory", false));
                }
                if (intent.hasExtra("android.intent.extra.STREAM")) {
                    if (intent.hasExtra("SEND_MULTIPLE") && intent.getBooleanExtra("SEND_MULTIPLE", false)) {
                        intent2.putParcelableArrayListExtra("android.intent.extra.STREAM", intent.getParcelableArrayListExtra("android.intent.extra.STREAM"));
                    } else {
                        intent2.putExtra("android.intent.extra.STREAM", intent.getParcelableExtra("android.intent.extra.STREAM"));
                    }
                }
                if (intent.hasExtra("sms_body")) {
                    intent2.putExtra("sms_body", intent.getStringExtra("sms_body"));
                }
                if (intent.hasExtra("android.intent.extra.TEXT")) {
                    intent2.putExtra("android.intent.extra.TEXT", intent.getStringExtra("android.intent.extra.TEXT"));
                }
                if (intent.hasExtra("SEND_MULTIPLE")) {
                    intent2.putExtra("SEND_MULTIPLE", intent.getBooleanExtra("SEND_MULTIPLE", false));
                }
                if (intent.hasExtra("FOCUS_ON_FIELD")) {
                    intent2.putExtra("FOCUS_ON_FIELD", intent.getStringExtra("FOCUS_ON_FIELD"));
                }
                zas PS = ((a) yyb.aL(a.class)).PS();
                boolean z2 = this.c;
                boolean z3 = this.d;
                boolean z4 = this.e;
                boolean z5 = this.f;
                if (b.b() && !TextUtils.isEmpty(stringExtra2)) {
                    Object obj = PS.i;
                    Object obj2 = PS.h;
                    abdj abdjVar = new abdj(PS, intent2, z2, z3, z4, z5);
                    rio rioVar = (rio) ((ibi) obj2).a.b();
                    rioVar.getClass();
                    ((rrb) obj).c(new rsy(rioVar, abdjVar));
                    rsy rsyVar = (rsy) ((rrb) PS.i).a();
                    String[] strArr = {stringExtra2};
                    String b2 = ((rrc) PS.i).b();
                    if (rsyVar.i(b2) && rsyVar.a == null) {
                        List asList = Arrays.asList(strArr);
                        ArrayList arrayList = new ArrayList();
                        Iterator it = asList.iterator();
                        while (it.hasNext()) {
                            String trim = ((String) it.next()).trim();
                            if (!TextUtils.isEmpty(trim)) {
                                arrayList.add(rxn.b(trim));
                            } else {
                                rxn.b.q("Hit empty recipient.");
                            }
                        }
                        if (qrl.a()) {
                            rsyVar.a = rsyVar.b.b(arrayList, new rsx(b2), rsyVar, Optional.empty());
                            return;
                        } else {
                            rsyVar.a = rsyVar.b.b(arrayList, b2, rsyVar, Optional.empty());
                            return;
                        }
                    }
                    return;
                }
                if (!b.b() && TextUtils.isEmpty(stringExtra2)) {
                    PS.d(intent2, b, z2, z3, z4, z5);
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("Invalid referer.");
        }
        throw new IllegalArgumentException("Can't perform action. isVerified is false");
    }
}
