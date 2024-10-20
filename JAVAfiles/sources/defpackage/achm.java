package defpackage;

import android.os.Parcelable;
import com.google.android.gms.search.queries.QueryCall$Request;
import com.google.android.gms.search.queries.QueryCall$Response;
import com.google.android.gms.search.queries.QuerySuggestCall$Request;
import com.google.android.gms.search.queries.QuerySuggestCall$Response;
import com.google.android.gms.signin.internal.AuthAccountResult;
import com.google.android.gms.signin.internal.CheckServerAuthResult;
import com.google.android.gms.signin.internal.RecordConsentByConsentResultRequest;
import com.google.android.gms.signin.internal.RecordConsentByConsentResultResponse;
import com.google.android.gms.signin.internal.RecordConsentRequest;
import com.google.android.gms.signin.internal.SignInRequest;
import com.google.android.gms.signin.internal.SignInResponse;
import com.google.android.gms.spatula.settings.SpatulaAvailability;
import com.google.android.gms.spatula.settings.SpatulaSettingPreference;
import com.google.android.gms.telephonyspam.CallSpamOptions;
import com.google.android.gms.telephonyspam.LookupSpamSettingsOptions;
import com.google.android.gms.telephonyspam.LookupSpamStatusOptions;
import com.google.android.gms.telephonyspam.MessageContent;
import com.google.android.gms.telephonyspam.MessageSpamOptions;
import com.google.android.gms.telephonyspam.ReportAsNotSpamOptions;
import com.google.android.gms.telephonyspam.ReportAsSpamOptions;
import com.google.android.gms.telephonyspam.SettingsLookupResult;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class achm implements Parcelable.Creator {
    private final /* synthetic */ int a;

    public achm(int i) {
        this.a = i;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: CFG modification limit reached, blocks count: 476
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:64)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:44)
        */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r20) {
        /*
            Method dump skipped, instructions count: 1334
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.achm.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new QueryCall$Response[i];
            case 1:
                return new QueryCall$Request[i];
            case 2:
                return new QuerySuggestCall$Request[i];
            case 3:
                return new QuerySuggestCall$Response[i];
            case 4:
                return new AuthAccountResult[i];
            case 5:
                return new CheckServerAuthResult[i];
            case 6:
                return new RecordConsentByConsentResultRequest[i];
            case 7:
                return new RecordConsentByConsentResultResponse[i];
            case 8:
                return new RecordConsentRequest[i];
            case 9:
                return new SignInRequest[i];
            case 10:
                return new SignInResponse[i];
            case 11:
                return new SpatulaAvailability[i];
            case 12:
                return new SpatulaSettingPreference[i];
            case 13:
                return new CallSpamOptions[i];
            case 14:
                return new LookupSpamSettingsOptions[i];
            case 15:
                return new LookupSpamStatusOptions[i];
            case 16:
                return new MessageContent[i];
            case 17:
                return new MessageSpamOptions[i];
            case 18:
                return new ReportAsNotSpamOptions[i];
            case 19:
                return new ReportAsSpamOptions[i];
            default:
                return new SettingsLookupResult[i];
        }
    }
}
