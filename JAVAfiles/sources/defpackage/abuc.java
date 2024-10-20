package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ClientIdentity;
import com.google.android.gms.common.internal.ConnectionInfo;
import com.google.android.gms.common.internal.ConnectionTelemetryConfiguration;
import com.google.android.gms.common.internal.GetServiceRequest;
import com.google.android.gms.common.internal.MethodInvocation;
import com.google.android.gms.common.internal.ResolveAccountRequest;
import com.google.android.gms.common.internal.ResolveAccountResponse;
import com.google.android.gms.common.internal.RootTelemetryConfiguration;
import com.google.android.gms.common.internal.SignInButtonConfig;
import com.google.android.gms.common.internal.TelemetryData;
import com.google.android.gms.common.internal.ValidateAccountRequest;
import com.google.android.gms.common.moduleinstall.ModuleAvailabilityResponse;
import com.google.android.gms.common.moduleinstall.ModuleInstallIntentResponse;
import com.google.android.gms.common.moduleinstall.ModuleInstallResponse;
import com.google.android.gms.common.moduleinstall.ModuleInstallStatusUpdate;
import com.google.android.gms.common.moduleinstall.internal.ApiFeatureRequest;
import com.google.android.gms.common.server.FavaDiagnosticsEntity;
import com.google.android.gms.common.server.converter.ConverterWrapper;
import com.google.android.gms.common.server.converter.StringToIntConverter;
import com.google.android.gms.common.server.response.FieldMappingDictionary;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class abuc implements Parcelable.Creator {
    private final /* synthetic */ int a;

    public abuc(int i) {
        this.a = i;
    }

    public static void a(GetServiceRequest getServiceRequest, Parcel parcel, int i) {
        int e = abhi.e(parcel);
        abhi.m(parcel, 1, getServiceRequest.c);
        abhi.m(parcel, 2, getServiceRequest.d);
        abhi.m(parcel, 3, getServiceRequest.e);
        abhi.q(parcel, 4, getServiceRequest.f, false);
        abhi.x(parcel, 5, getServiceRequest.g);
        abhi.H(parcel, 6, getServiceRequest.h, i);
        abhi.t(parcel, 7, getServiceRequest.i);
        abhi.o(parcel, 8, getServiceRequest.j, i, false);
        abhi.H(parcel, 10, getServiceRequest.k, i);
        abhi.H(parcel, 11, getServiceRequest.l, i);
        abhi.h(parcel, 12, getServiceRequest.m);
        abhi.m(parcel, 13, getServiceRequest.n);
        abhi.h(parcel, 14, getServiceRequest.o);
        abhi.q(parcel, 15, getServiceRequest.p, false);
        abhi.g(parcel, e);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: CFG modification limit reached, blocks count: 521
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:64)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:44)
        */
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r26) {
        /*
            Method dump skipped, instructions count: 1498
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.abuc.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new ConnectionInfo[i];
            case 1:
                return new ClientIdentity[i];
            case 2:
                return new ConnectionTelemetryConfiguration[i];
            case 3:
                return new GetServiceRequest[i];
            case 4:
                return new MethodInvocation[i];
            case 5:
                return new ResolveAccountRequest[i];
            case 6:
                return new ResolveAccountResponse[i];
            case 7:
                return new RootTelemetryConfiguration[i];
            case 8:
                return new SignInButtonConfig[i];
            case 9:
                return new TelemetryData[i];
            case 10:
                return new ValidateAccountRequest[i];
            case 11:
                return new ModuleAvailabilityResponse[i];
            case 12:
                return new ModuleInstallIntentResponse[i];
            case 13:
                return new ModuleInstallResponse[i];
            case 14:
                return new ModuleInstallStatusUpdate[i];
            case 15:
                return new ApiFeatureRequest[i];
            case 16:
                return new FavaDiagnosticsEntity[i];
            case 17:
                return new ConverterWrapper[i];
            case 18:
                return new StringToIntConverter[i];
            case 19:
                return new StringToIntConverter.Entry[i];
            default:
                return new FieldMappingDictionary.FieldMapPair[i];
        }
    }
}
