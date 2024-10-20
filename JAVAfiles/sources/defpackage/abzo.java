package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.fido.u2f.api.common.ErrorResponseData;
import com.google.android.gms.fido.u2f.api.common.KeyHandle;
import com.google.android.gms.fido.u2f.api.common.ProtocolVersion;
import com.google.android.gms.fido.u2f.api.common.RegisterRequest;
import com.google.android.gms.fido.u2f.api.common.RegisterRequestParams;
import com.google.android.gms.fido.u2f.api.common.RegisterResponseData;
import com.google.android.gms.fido.u2f.api.common.RegisteredKey;
import com.google.android.gms.fido.u2f.api.common.SignRequestParams;
import com.google.android.gms.fido.u2f.api.common.SignResponseData;
import com.google.android.gms.gmscompliance.GmsDeviceComplianceResponse;
import com.google.android.gms.googlehelp.FRDProductSpecificDataEntry;
import com.google.android.gms.googlehelp.InProductHelp;
import com.google.android.gms.googlehelp.ND4CSettings;
import com.google.android.gms.googlehelp.OfflineSuggestion;
import com.google.android.gms.googlehelp.SupportRequestHelp;
import com.google.android.gms.googlehelp.internal.common.OverflowMenuItem;
import com.google.android.gms.googlehelp.internal.common.TogglingData;
import com.google.android.gms.googlehelp.trails.TrailsInteraction;
import com.google.android.gms.identity.accounts.api.AccountData;
import com.google.android.gms.identity.intents.UserAddressRequest;
import com.google.android.gms.identity.intents.model.CountrySpecification;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abzo implements Parcelable.Creator {
    private final /* synthetic */ int a;

    public abzo(int i) {
        this.a = i;
    }

    public static void a(InProductHelp inProductHelp, Parcel parcel, int i) {
        int e = abhi.e(parcel);
        abhi.o(parcel, 1, inProductHelp.a, i, false);
        abhi.q(parcel, 2, inProductHelp.b, false);
        abhi.q(parcel, 3, inProductHelp.c, false);
        abhi.m(parcel, 4, inProductHelp.d);
        abhi.q(parcel, 5, inProductHelp.e, false);
        abhi.m(parcel, 6, inProductHelp.f);
        abhi.q(parcel, 7, inProductHelp.g, false);
        abhi.g(parcel, e);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: CFG modification limit reached, blocks count: 532
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:64)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:44)
        */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r22) {
        /*
            Method dump skipped, instructions count: 1434
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.abzo.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new KeyHandle[i];
            case 1:
                return new ErrorResponseData[i];
            case 2:
                return new ProtocolVersion[i];
            case 3:
                return new RegisterRequest[i];
            case 4:
                return new RegisterRequestParams[i];
            case 5:
                return new RegisterResponseData[i];
            case 6:
                return new RegisteredKey[i];
            case 7:
                return new SignRequestParams[i];
            case 8:
                return new SignResponseData[i];
            case 9:
                return new GmsDeviceComplianceResponse[i];
            case 10:
                return new FRDProductSpecificDataEntry[i];
            case 11:
                return new InProductHelp[i];
            case 12:
                return new ND4CSettings[i];
            case 13:
                return new OfflineSuggestion[i];
            case 14:
                return new SupportRequestHelp[i];
            case 15:
                return new OverflowMenuItem[i];
            case 16:
                return new TogglingData[i];
            case 17:
                return new TrailsInteraction[i];
            case 18:
                return new AccountData[i];
            case 19:
                return new UserAddressRequest[i];
            default:
                return new CountrySpecification[i];
        }
    }
}
