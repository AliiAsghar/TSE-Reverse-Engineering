package com.google.android.gms.location.internal;

import android.app.PendingIntent;
import android.location.Location;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.common.api.internal.IStatusCallback;
import com.google.android.gms.common.internal.ICancelToken;
import com.google.android.gms.location.ActivityRecognitionRequest;
import com.google.android.gms.location.ActivityRecognitionResult;
import com.google.android.gms.location.ActivityTransitionRequest;
import com.google.android.gms.location.CurrentLocationRequest;
import com.google.android.gms.location.GeofencingRequest;
import com.google.android.gms.location.IFlpDebugListener;
import com.google.android.gms.location.ILocationListener;
import com.google.android.gms.location.LastLocationRequest;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationAvailabilityRequest;
import com.google.android.gms.location.LocationRequest;
import com.google.android.gms.location.LocationSettingsRequest;
import com.google.android.gms.location.SleepSegmentRequest;
import com.google.android.gms.location.internal.IBooleanStatusCallback;
import com.google.android.gms.location.internal.IFusedLocationProviderCallback;
import com.google.android.gms.location.internal.IGeofencerCallbacks;
import com.google.android.gms.location.internal.ILocationStatusCallback;
import com.google.android.gms.location.internal.ISettingsCallbacks;
import defpackage.iax;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface IGoogleLocationManagerService extends IInterface {

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public static abstract class Stub extends BaseStub implements IGoogleLocationManagerService {
        static final int TRANSACTION_addGeofence = 1;
        static final int TRANSACTION_addGeofenceByGeofencingRequest = 57;
        static final int TRANSACTION_addGeofences = 97;
        static final int TRANSACTION_checkLocationSettings = 63;
        static final int TRANSACTION_flushActivityRecognitionResults = 71;
        static final int TRANSACTION_flushLocations = 67;
        static final int TRANSACTION_getActivityRecognitionMode = 78;
        static final int TRANSACTION_getCurrentLocation = 87;
        static final int TRANSACTION_getCurrentLocationWithCallback = 92;
        static final int TRANSACTION_getLastActivity = 64;
        static final int TRANSACTION_getLastActivityWithFeature = 81;
        static final int TRANSACTION_getLastAvailability = 91;
        static final int TRANSACTION_getLastAvailabilityWithPackage = 34;
        static final int TRANSACTION_getLastLocation = 7;
        static final int TRANSACTION_getLastLocationWithAttribution = 80;
        static final int TRANSACTION_getLastLocationWithCallback = 90;
        static final int TRANSACTION_getLastLocationWithPackage = 21;
        static final int TRANSACTION_getLastLocationWithRequest = 82;
        static final int TRANSACTION_injectLocation = 26;
        static final int TRANSACTION_injectLocationWithCallback = 86;
        static final int TRANSACTION_isGoogleLocationAccuracyEnabled = 95;
        static final int TRANSACTION_isLocationEnabled = 99;
        static final int TRANSACTION_registerDebugListener = 93;
        static final int TRANSACTION_registerLocationClient = 88;
        static final int TRANSACTION_removeActivityTransitionUpdates = 73;
        static final int TRANSACTION_removeActivityUpdates = 6;
        static final int TRANSACTION_removeFloorChangeUpdates = 66;
        static final int TRANSACTION_removeGeofenceByRemoveGeofencingRequest = 74;
        static final int TRANSACTION_removeGeofences = 98;
        static final int TRANSACTION_removeGeofencesByPendingIntent = 2;
        static final int TRANSACTION_removeGeofencesByRequestIds = 3;
        static final int TRANSACTION_removeLocationUpdates = 10;
        static final int TRANSACTION_removeLocationUpdatesWithPendingIntent = 11;
        static final int TRANSACTION_removeSleepSegmentUpdates = 69;
        static final int TRANSACTION_requestActivityTransitionUpdates = 72;
        static final int TRANSACTION_requestActivityUpdates = 5;
        static final int TRANSACTION_requestActivityUpdates2 = 70;
        static final int TRANSACTION_requestFloorChangeUpdates = 65;
        static final int TRANSACTION_requestLocationUpdates = 8;
        static final int TRANSACTION_requestLocationUpdatesInternal = 52;
        static final int TRANSACTION_requestLocationUpdatesInternalWithPendingIntent = 53;
        static final int TRANSACTION_requestLocationUpdatesWithPackage = 20;
        static final int TRANSACTION_requestLocationUpdatesWithPendingIntent = 9;
        static final int TRANSACTION_requestPassiveWifiScans = 76;
        static final int TRANSACTION_requestSleepSegmentUpdates = 68;
        static final int TRANSACTION_requestSleepSegments = 79;
        static final int TRANSACTION_setActivityRecognitionMode = 77;
        static final int TRANSACTION_setGoogleLocationAccuracyEnabled = 96;
        static final int TRANSACTION_setMockLocation = 13;
        static final int TRANSACTION_setMockLocationWithCallback = 85;
        static final int TRANSACTION_setMockMode = 12;
        static final int TRANSACTION_setMockModeWithCallback = 84;
        static final int TRANSACTION_unregisterDebugListener = 94;
        static final int TRANSACTION_unregisterLocationClient = 89;
        static final int TRANSACTION_updateDeviceOrientationRequest = 75;
        static final int TRANSACTION_updateLocationRequest = 59;

        /* compiled from: PG */
        /* loaded from: classes2.dex */
        public static class Proxy extends BaseProxy implements IGoogleLocationManagerService {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.location.internal.IGoogleLocationManagerService");
            }

            @Override // com.google.android.gms.location.internal.IGoogleLocationManagerService
            public void addGeofence(List<ParcelableGeofence> list, PendingIntent pendingIntent, IGeofencerCallbacks iGeofencerCallbacks, String str) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeTypedList(list);
                iax.d(obtainAndWriteInterfaceToken, pendingIntent);
                iax.f(obtainAndWriteInterfaceToken, iGeofencerCallbacks);
                obtainAndWriteInterfaceToken.writeString(str);
                transactAndReadExceptionReturnVoid(1, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.location.internal.IGoogleLocationManagerService
            public void addGeofenceByGeofencingRequest(GeofencingRequest geofencingRequest, PendingIntent pendingIntent, IGeofencerCallbacks iGeofencerCallbacks) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, geofencingRequest);
                iax.d(obtainAndWriteInterfaceToken, pendingIntent);
                iax.f(obtainAndWriteInterfaceToken, iGeofencerCallbacks);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_addGeofenceByGeofencingRequest, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.location.internal.IGoogleLocationManagerService
            public void addGeofences(GeofencingRequest geofencingRequest, PendingIntent pendingIntent, IStatusCallback iStatusCallback) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, geofencingRequest);
                iax.d(obtainAndWriteInterfaceToken, pendingIntent);
                iax.f(obtainAndWriteInterfaceToken, iStatusCallback);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_addGeofences, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.location.internal.IGoogleLocationManagerService
            public void checkLocationSettings(LocationSettingsRequest locationSettingsRequest, ISettingsCallbacks iSettingsCallbacks, String str) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, locationSettingsRequest);
                iax.f(obtainAndWriteInterfaceToken, iSettingsCallbacks);
                obtainAndWriteInterfaceToken.writeString(str);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_checkLocationSettings, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.location.internal.IGoogleLocationManagerService
            public void flushActivityRecognitionResults(IStatusCallback iStatusCallback) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iStatusCallback);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_flushActivityRecognitionResults, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.location.internal.IGoogleLocationManagerService
            public void flushLocations(IFusedLocationProviderCallback iFusedLocationProviderCallback) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iFusedLocationProviderCallback);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_flushLocations, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.location.internal.IGoogleLocationManagerService
            public int getActivityRecognitionMode() {
                Parcel transactAndReadException = transactAndReadException(Stub.TRANSACTION_getActivityRecognitionMode, obtainAndWriteInterfaceToken());
                int readInt = transactAndReadException.readInt();
                transactAndReadException.recycle();
                return readInt;
            }

            @Override // com.google.android.gms.location.internal.IGoogleLocationManagerService
            public ICancelToken getCurrentLocation(CurrentLocationRequest currentLocationRequest, ILocationStatusCallback iLocationStatusCallback) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, currentLocationRequest);
                iax.f(obtainAndWriteInterfaceToken, iLocationStatusCallback);
                Parcel transactAndReadException = transactAndReadException(Stub.TRANSACTION_getCurrentLocation, obtainAndWriteInterfaceToken);
                ICancelToken asInterface = ICancelToken.Stub.asInterface(transactAndReadException.readStrongBinder());
                transactAndReadException.recycle();
                return asInterface;
            }

            @Override // com.google.android.gms.location.internal.IGoogleLocationManagerService
            public ICancelToken getCurrentLocationWithCallback(CurrentLocationRequest currentLocationRequest, LocationReceiver locationReceiver) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, currentLocationRequest);
                iax.d(obtainAndWriteInterfaceToken, locationReceiver);
                Parcel transactAndReadException = transactAndReadException(Stub.TRANSACTION_getCurrentLocationWithCallback, obtainAndWriteInterfaceToken);
                ICancelToken asInterface = ICancelToken.Stub.asInterface(transactAndReadException.readStrongBinder());
                transactAndReadException.recycle();
                return asInterface;
            }

            @Override // com.google.android.gms.location.internal.IGoogleLocationManagerService
            public ActivityRecognitionResult getLastActivity(String str) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeString(str);
                Parcel transactAndReadException = transactAndReadException(Stub.TRANSACTION_getLastActivity, obtainAndWriteInterfaceToken);
                ActivityRecognitionResult activityRecognitionResult = (ActivityRecognitionResult) iax.a(transactAndReadException, ActivityRecognitionResult.CREATOR);
                transactAndReadException.recycle();
                return activityRecognitionResult;
            }

            @Override // com.google.android.gms.location.internal.IGoogleLocationManagerService
            public ActivityRecognitionResult getLastActivityWithFeature(String str, String str2) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeString(str);
                obtainAndWriteInterfaceToken.writeString(str2);
                Parcel transactAndReadException = transactAndReadException(Stub.TRANSACTION_getLastActivityWithFeature, obtainAndWriteInterfaceToken);
                ActivityRecognitionResult activityRecognitionResult = (ActivityRecognitionResult) iax.a(transactAndReadException, ActivityRecognitionResult.CREATOR);
                transactAndReadException.recycle();
                return activityRecognitionResult;
            }

            @Override // com.google.android.gms.location.internal.IGoogleLocationManagerService
            public void getLastAvailability(LocationAvailabilityRequest locationAvailabilityRequest, LocationReceiver locationReceiver) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, locationAvailabilityRequest);
                iax.d(obtainAndWriteInterfaceToken, locationReceiver);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_getLastAvailability, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.location.internal.IGoogleLocationManagerService
            public LocationAvailability getLastAvailabilityWithPackage(String str) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeString(str);
                Parcel transactAndReadException = transactAndReadException(34, obtainAndWriteInterfaceToken);
                LocationAvailability locationAvailability = (LocationAvailability) iax.a(transactAndReadException, LocationAvailability.CREATOR);
                transactAndReadException.recycle();
                return locationAvailability;
            }

            @Override // com.google.android.gms.location.internal.IGoogleLocationManagerService
            public Location getLastLocation() {
                Parcel transactAndReadException = transactAndReadException(7, obtainAndWriteInterfaceToken());
                Location location = (Location) iax.a(transactAndReadException, Location.CREATOR);
                transactAndReadException.recycle();
                return location;
            }

            @Override // com.google.android.gms.location.internal.IGoogleLocationManagerService
            public Location getLastLocationWithAttribution(String str) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeString(str);
                Parcel transactAndReadException = transactAndReadException(Stub.TRANSACTION_getLastLocationWithAttribution, obtainAndWriteInterfaceToken);
                Location location = (Location) iax.a(transactAndReadException, Location.CREATOR);
                transactAndReadException.recycle();
                return location;
            }

            @Override // com.google.android.gms.location.internal.IGoogleLocationManagerService
            public void getLastLocationWithCallback(LastLocationRequest lastLocationRequest, LocationReceiver locationReceiver) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, lastLocationRequest);
                iax.d(obtainAndWriteInterfaceToken, locationReceiver);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_getLastLocationWithCallback, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.location.internal.IGoogleLocationManagerService
            public Location getLastLocationWithPackage(String str) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeString(str);
                Parcel transactAndReadException = transactAndReadException(21, obtainAndWriteInterfaceToken);
                Location location = (Location) iax.a(transactAndReadException, Location.CREATOR);
                transactAndReadException.recycle();
                return location;
            }

            @Override // com.google.android.gms.location.internal.IGoogleLocationManagerService
            public void getLastLocationWithRequest(LastLocationRequest lastLocationRequest, ILocationStatusCallback iLocationStatusCallback) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, lastLocationRequest);
                iax.f(obtainAndWriteInterfaceToken, iLocationStatusCallback);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_getLastLocationWithRequest, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.location.internal.IGoogleLocationManagerService
            public void injectLocation(Location location, int i) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, location);
                obtainAndWriteInterfaceToken.writeInt(i);
                transactAndReadExceptionReturnVoid(26, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.location.internal.IGoogleLocationManagerService
            public void injectLocationWithCallback(Location location, int i, IStatusCallback iStatusCallback) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, location);
                obtainAndWriteInterfaceToken.writeInt(i);
                iax.f(obtainAndWriteInterfaceToken, iStatusCallback);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_injectLocationWithCallback, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.location.internal.IGoogleLocationManagerService
            public void isGoogleLocationAccuracyEnabled(IBooleanStatusCallback iBooleanStatusCallback) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iBooleanStatusCallback);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_isGoogleLocationAccuracyEnabled, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.location.internal.IGoogleLocationManagerService
            public void isLocationEnabled(IBooleanStatusCallback iBooleanStatusCallback) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iBooleanStatusCallback);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_isLocationEnabled, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.location.internal.IGoogleLocationManagerService
            public void registerDebugListener(IFlpDebugListener iFlpDebugListener, IStatusCallback iStatusCallback) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iFlpDebugListener);
                iax.f(obtainAndWriteInterfaceToken, iStatusCallback);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_registerDebugListener, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.location.internal.IGoogleLocationManagerService
            public void registerLocationClient(LocationReceiver locationReceiver, LocationRequest locationRequest, IStatusCallback iStatusCallback) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, locationReceiver);
                iax.d(obtainAndWriteInterfaceToken, locationRequest);
                iax.f(obtainAndWriteInterfaceToken, iStatusCallback);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_registerLocationClient, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.location.internal.IGoogleLocationManagerService
            public void removeActivityTransitionUpdates(PendingIntent pendingIntent, IStatusCallback iStatusCallback) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, pendingIntent);
                iax.f(obtainAndWriteInterfaceToken, iStatusCallback);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_removeActivityTransitionUpdates, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.location.internal.IGoogleLocationManagerService
            public void removeActivityUpdates(PendingIntent pendingIntent) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, pendingIntent);
                transactAndReadExceptionReturnVoid(6, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.location.internal.IGoogleLocationManagerService
            public void removeFloorChangeUpdates(PendingIntent pendingIntent, IStatusCallback iStatusCallback) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, pendingIntent);
                iax.f(obtainAndWriteInterfaceToken, iStatusCallback);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_removeFloorChangeUpdates, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.location.internal.IGoogleLocationManagerService
            public void removeGeofenceByRemoveGeofencingRequest(RemoveGeofencingRequest removeGeofencingRequest, IGeofencerCallbacks iGeofencerCallbacks) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, removeGeofencingRequest);
                iax.f(obtainAndWriteInterfaceToken, iGeofencerCallbacks);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_removeGeofenceByRemoveGeofencingRequest, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.location.internal.IGoogleLocationManagerService
            public void removeGeofences(RemoveGeofencingRequest removeGeofencingRequest, IStatusCallback iStatusCallback) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, removeGeofencingRequest);
                iax.f(obtainAndWriteInterfaceToken, iStatusCallback);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_removeGeofences, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.location.internal.IGoogleLocationManagerService
            public void removeGeofencesByPendingIntent(PendingIntent pendingIntent, IGeofencerCallbacks iGeofencerCallbacks, String str) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, pendingIntent);
                iax.f(obtainAndWriteInterfaceToken, iGeofencerCallbacks);
                obtainAndWriteInterfaceToken.writeString(str);
                transactAndReadExceptionReturnVoid(2, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.location.internal.IGoogleLocationManagerService
            public void removeGeofencesByRequestIds(String[] strArr, IGeofencerCallbacks iGeofencerCallbacks, String str) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeStringArray(strArr);
                iax.f(obtainAndWriteInterfaceToken, iGeofencerCallbacks);
                obtainAndWriteInterfaceToken.writeString(str);
                transactAndReadExceptionReturnVoid(3, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.location.internal.IGoogleLocationManagerService
            public void removeLocationUpdates(ILocationListener iLocationListener) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iLocationListener);
                transactAndReadExceptionReturnVoid(10, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.location.internal.IGoogleLocationManagerService
            public void removeLocationUpdatesWithPendingIntent(PendingIntent pendingIntent) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, pendingIntent);
                transactAndReadExceptionReturnVoid(11, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.location.internal.IGoogleLocationManagerService
            public void removeSleepSegmentUpdates(PendingIntent pendingIntent, IStatusCallback iStatusCallback) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, pendingIntent);
                iax.f(obtainAndWriteInterfaceToken, iStatusCallback);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_removeSleepSegmentUpdates, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.location.internal.IGoogleLocationManagerService
            public void requestActivityTransitionUpdates(ActivityTransitionRequest activityTransitionRequest, PendingIntent pendingIntent, IStatusCallback iStatusCallback) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, activityTransitionRequest);
                iax.d(obtainAndWriteInterfaceToken, pendingIntent);
                iax.f(obtainAndWriteInterfaceToken, iStatusCallback);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_requestActivityTransitionUpdates, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.location.internal.IGoogleLocationManagerService
            public void requestActivityUpdates(long j, boolean z, PendingIntent pendingIntent) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeLong(j);
                int i = iax.a;
                obtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                iax.d(obtainAndWriteInterfaceToken, pendingIntent);
                transactAndReadExceptionReturnVoid(5, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.location.internal.IGoogleLocationManagerService
            public void requestActivityUpdates2(ActivityRecognitionRequest activityRecognitionRequest, PendingIntent pendingIntent, IStatusCallback iStatusCallback) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, activityRecognitionRequest);
                iax.d(obtainAndWriteInterfaceToken, pendingIntent);
                iax.f(obtainAndWriteInterfaceToken, iStatusCallback);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_requestActivityUpdates2, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.location.internal.IGoogleLocationManagerService
            public void requestFloorChangeUpdates(PendingIntent pendingIntent, IStatusCallback iStatusCallback) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, pendingIntent);
                iax.f(obtainAndWriteInterfaceToken, iStatusCallback);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_requestFloorChangeUpdates, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.location.internal.IGoogleLocationManagerService
            public void requestLocationUpdates(LocationRequest locationRequest, ILocationListener iLocationListener) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, locationRequest);
                iax.f(obtainAndWriteInterfaceToken, iLocationListener);
                transactAndReadExceptionReturnVoid(8, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.location.internal.IGoogleLocationManagerService
            public void requestLocationUpdatesInternal(LocationRequestInternal locationRequestInternal, ILocationListener iLocationListener) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, locationRequestInternal);
                iax.f(obtainAndWriteInterfaceToken, iLocationListener);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_requestLocationUpdatesInternal, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.location.internal.IGoogleLocationManagerService
            public void requestLocationUpdatesInternalWithPendingIntent(LocationRequestInternal locationRequestInternal, PendingIntent pendingIntent) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, locationRequestInternal);
                iax.d(obtainAndWriteInterfaceToken, pendingIntent);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_requestLocationUpdatesInternalWithPendingIntent, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.location.internal.IGoogleLocationManagerService
            public void requestLocationUpdatesWithPackage(LocationRequest locationRequest, ILocationListener iLocationListener, String str) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, locationRequest);
                iax.f(obtainAndWriteInterfaceToken, iLocationListener);
                obtainAndWriteInterfaceToken.writeString(str);
                transactAndReadExceptionReturnVoid(20, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.location.internal.IGoogleLocationManagerService
            public void requestLocationUpdatesWithPendingIntent(LocationRequest locationRequest, PendingIntent pendingIntent) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, locationRequest);
                iax.d(obtainAndWriteInterfaceToken, pendingIntent);
                transactAndReadExceptionReturnVoid(9, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.location.internal.IGoogleLocationManagerService
            public void requestPassiveWifiScans(PendingIntent pendingIntent) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, pendingIntent);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_requestPassiveWifiScans, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.location.internal.IGoogleLocationManagerService
            public void requestSleepSegmentUpdates(PendingIntent pendingIntent, IStatusCallback iStatusCallback) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, pendingIntent);
                iax.f(obtainAndWriteInterfaceToken, iStatusCallback);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_requestSleepSegmentUpdates, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.location.internal.IGoogleLocationManagerService
            public void requestSleepSegments(PendingIntent pendingIntent, SleepSegmentRequest sleepSegmentRequest, IStatusCallback iStatusCallback) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, pendingIntent);
                iax.d(obtainAndWriteInterfaceToken, sleepSegmentRequest);
                iax.f(obtainAndWriteInterfaceToken, iStatusCallback);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_requestSleepSegments, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.location.internal.IGoogleLocationManagerService
            public boolean setActivityRecognitionMode(int i) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeInt(i);
                Parcel transactAndReadException = transactAndReadException(Stub.TRANSACTION_setActivityRecognitionMode, obtainAndWriteInterfaceToken);
                boolean g = iax.g(transactAndReadException);
                transactAndReadException.recycle();
                return g;
            }

            @Override // com.google.android.gms.location.internal.IGoogleLocationManagerService
            public void setGoogleLocationAccuracyEnabled(SetGoogleLocationAccuracyRequest setGoogleLocationAccuracyRequest, IStatusCallback iStatusCallback) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, setGoogleLocationAccuracyRequest);
                iax.f(obtainAndWriteInterfaceToken, iStatusCallback);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_setGoogleLocationAccuracyEnabled, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.location.internal.IGoogleLocationManagerService
            public void setMockLocation(Location location) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, location);
                transactAndReadExceptionReturnVoid(13, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.location.internal.IGoogleLocationManagerService
            public void setMockLocationWithCallback(Location location, IStatusCallback iStatusCallback) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, location);
                iax.f(obtainAndWriteInterfaceToken, iStatusCallback);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_setMockLocationWithCallback, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.location.internal.IGoogleLocationManagerService
            public void setMockMode(boolean z) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                int i = iax.a;
                obtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                transactAndReadExceptionReturnVoid(12, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.location.internal.IGoogleLocationManagerService
            public void setMockModeWithCallback(boolean z, IStatusCallback iStatusCallback) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                int i = iax.a;
                obtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                iax.f(obtainAndWriteInterfaceToken, iStatusCallback);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_setMockModeWithCallback, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.location.internal.IGoogleLocationManagerService
            public void unregisterDebugListener(IFlpDebugListener iFlpDebugListener, IStatusCallback iStatusCallback) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iFlpDebugListener);
                iax.f(obtainAndWriteInterfaceToken, iStatusCallback);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_unregisterDebugListener, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.location.internal.IGoogleLocationManagerService
            public void unregisterLocationClient(LocationReceiver locationReceiver, IStatusCallback iStatusCallback) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, locationReceiver);
                iax.f(obtainAndWriteInterfaceToken, iStatusCallback);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_unregisterLocationClient, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.location.internal.IGoogleLocationManagerService
            public void updateDeviceOrientationRequest(DeviceOrientationRequestUpdateData deviceOrientationRequestUpdateData) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, deviceOrientationRequestUpdateData);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_updateDeviceOrientationRequest, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.location.internal.IGoogleLocationManagerService
            public void updateLocationRequest(LocationRequestUpdateData locationRequestUpdateData) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, locationRequestUpdateData);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_updateLocationRequest, obtainAndWriteInterfaceToken);
            }
        }

        public Stub() {
            super("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        }

        public static IGoogleLocationManagerService asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.internal.IGoogleLocationManagerService");
            if (queryLocalInterface instanceof IGoogleLocationManagerService) {
                return (IGoogleLocationManagerService) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        /* JADX WARN: Failed to find 'out' block for switch in B:23:0x0029. Please report as an issue. */
        /* JADX WARN: Failed to find 'out' block for switch in B:24:0x002c. Please report as an issue. */
        /* JADX WARN: Failed to find 'out' block for switch in B:25:0x002f. Please report as an issue. */
        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 20) {
                            if (i != 21) {
                                if (i != 26) {
                                    if (i != 34) {
                                        if (i != TRANSACTION_addGeofenceByGeofencingRequest) {
                                            if (i != TRANSACTION_updateLocationRequest) {
                                                if (i != TRANSACTION_requestLocationUpdatesInternal) {
                                                    if (i != TRANSACTION_requestLocationUpdatesInternalWithPendingIntent) {
                                                        switch (i) {
                                                            case 5:
                                                                long readLong = parcel.readLong();
                                                                boolean g = iax.g(parcel);
                                                                PendingIntent pendingIntent = (PendingIntent) iax.a(parcel, PendingIntent.CREATOR);
                                                                enforceNoDataAvail(parcel);
                                                                requestActivityUpdates(readLong, g, pendingIntent);
                                                                parcel2.writeNoException();
                                                                break;
                                                            case 6:
                                                                PendingIntent pendingIntent2 = (PendingIntent) iax.a(parcel, PendingIntent.CREATOR);
                                                                enforceNoDataAvail(parcel);
                                                                removeActivityUpdates(pendingIntent2);
                                                                parcel2.writeNoException();
                                                                break;
                                                            case 7:
                                                                Location lastLocation = getLastLocation();
                                                                parcel2.writeNoException();
                                                                iax.e(parcel2, lastLocation);
                                                                break;
                                                            case 8:
                                                                LocationRequest locationRequest = (LocationRequest) iax.a(parcel, LocationRequest.CREATOR);
                                                                ILocationListener asInterface = ILocationListener.Stub.asInterface(parcel.readStrongBinder());
                                                                enforceNoDataAvail(parcel);
                                                                requestLocationUpdates(locationRequest, asInterface);
                                                                parcel2.writeNoException();
                                                                break;
                                                            case 9:
                                                                LocationRequest locationRequest2 = (LocationRequest) iax.a(parcel, LocationRequest.CREATOR);
                                                                PendingIntent pendingIntent3 = (PendingIntent) iax.a(parcel, PendingIntent.CREATOR);
                                                                enforceNoDataAvail(parcel);
                                                                requestLocationUpdatesWithPendingIntent(locationRequest2, pendingIntent3);
                                                                parcel2.writeNoException();
                                                                break;
                                                            case 10:
                                                                ILocationListener asInterface2 = ILocationListener.Stub.asInterface(parcel.readStrongBinder());
                                                                enforceNoDataAvail(parcel);
                                                                removeLocationUpdates(asInterface2);
                                                                parcel2.writeNoException();
                                                                break;
                                                            case 11:
                                                                PendingIntent pendingIntent4 = (PendingIntent) iax.a(parcel, PendingIntent.CREATOR);
                                                                enforceNoDataAvail(parcel);
                                                                removeLocationUpdatesWithPendingIntent(pendingIntent4);
                                                                parcel2.writeNoException();
                                                                break;
                                                            case 12:
                                                                boolean g2 = iax.g(parcel);
                                                                enforceNoDataAvail(parcel);
                                                                setMockMode(g2);
                                                                parcel2.writeNoException();
                                                                break;
                                                            case 13:
                                                                Location location = (Location) iax.a(parcel, Location.CREATOR);
                                                                enforceNoDataAvail(parcel);
                                                                setMockLocation(location);
                                                                parcel2.writeNoException();
                                                                break;
                                                            default:
                                                                switch (i) {
                                                                    case TRANSACTION_checkLocationSettings /* 63 */:
                                                                        LocationSettingsRequest locationSettingsRequest = (LocationSettingsRequest) iax.a(parcel, LocationSettingsRequest.CREATOR);
                                                                        ISettingsCallbacks asInterface3 = ISettingsCallbacks.Stub.asInterface(parcel.readStrongBinder());
                                                                        String readString = parcel.readString();
                                                                        enforceNoDataAvail(parcel);
                                                                        checkLocationSettings(locationSettingsRequest, asInterface3, readString);
                                                                        parcel2.writeNoException();
                                                                        break;
                                                                    case TRANSACTION_getLastActivity /* 64 */:
                                                                        String readString2 = parcel.readString();
                                                                        enforceNoDataAvail(parcel);
                                                                        ActivityRecognitionResult lastActivity = getLastActivity(readString2);
                                                                        parcel2.writeNoException();
                                                                        iax.e(parcel2, lastActivity);
                                                                        break;
                                                                    case TRANSACTION_requestFloorChangeUpdates /* 65 */:
                                                                        PendingIntent pendingIntent5 = (PendingIntent) iax.a(parcel, PendingIntent.CREATOR);
                                                                        IStatusCallback asInterface4 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                                                                        enforceNoDataAvail(parcel);
                                                                        requestFloorChangeUpdates(pendingIntent5, asInterface4);
                                                                        parcel2.writeNoException();
                                                                        break;
                                                                    case TRANSACTION_removeFloorChangeUpdates /* 66 */:
                                                                        PendingIntent pendingIntent6 = (PendingIntent) iax.a(parcel, PendingIntent.CREATOR);
                                                                        IStatusCallback asInterface5 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                                                                        enforceNoDataAvail(parcel);
                                                                        removeFloorChangeUpdates(pendingIntent6, asInterface5);
                                                                        parcel2.writeNoException();
                                                                        break;
                                                                    case TRANSACTION_flushLocations /* 67 */:
                                                                        IFusedLocationProviderCallback asInterface6 = IFusedLocationProviderCallback.Stub.asInterface(parcel.readStrongBinder());
                                                                        enforceNoDataAvail(parcel);
                                                                        flushLocations(asInterface6);
                                                                        parcel2.writeNoException();
                                                                        break;
                                                                    case TRANSACTION_requestSleepSegmentUpdates /* 68 */:
                                                                        PendingIntent pendingIntent7 = (PendingIntent) iax.a(parcel, PendingIntent.CREATOR);
                                                                        IStatusCallback asInterface7 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                                                                        enforceNoDataAvail(parcel);
                                                                        requestSleepSegmentUpdates(pendingIntent7, asInterface7);
                                                                        parcel2.writeNoException();
                                                                        break;
                                                                    case TRANSACTION_removeSleepSegmentUpdates /* 69 */:
                                                                        PendingIntent pendingIntent8 = (PendingIntent) iax.a(parcel, PendingIntent.CREATOR);
                                                                        IStatusCallback asInterface8 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                                                                        enforceNoDataAvail(parcel);
                                                                        removeSleepSegmentUpdates(pendingIntent8, asInterface8);
                                                                        parcel2.writeNoException();
                                                                        break;
                                                                    case TRANSACTION_requestActivityUpdates2 /* 70 */:
                                                                        ActivityRecognitionRequest activityRecognitionRequest = (ActivityRecognitionRequest) iax.a(parcel, ActivityRecognitionRequest.CREATOR);
                                                                        PendingIntent pendingIntent9 = (PendingIntent) iax.a(parcel, PendingIntent.CREATOR);
                                                                        IStatusCallback asInterface9 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                                                                        enforceNoDataAvail(parcel);
                                                                        requestActivityUpdates2(activityRecognitionRequest, pendingIntent9, asInterface9);
                                                                        parcel2.writeNoException();
                                                                        break;
                                                                    case TRANSACTION_flushActivityRecognitionResults /* 71 */:
                                                                        IStatusCallback asInterface10 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                                                                        enforceNoDataAvail(parcel);
                                                                        flushActivityRecognitionResults(asInterface10);
                                                                        parcel2.writeNoException();
                                                                        break;
                                                                    case TRANSACTION_requestActivityTransitionUpdates /* 72 */:
                                                                        ActivityTransitionRequest activityTransitionRequest = (ActivityTransitionRequest) iax.a(parcel, ActivityTransitionRequest.CREATOR);
                                                                        PendingIntent pendingIntent10 = (PendingIntent) iax.a(parcel, PendingIntent.CREATOR);
                                                                        IStatusCallback asInterface11 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                                                                        enforceNoDataAvail(parcel);
                                                                        requestActivityTransitionUpdates(activityTransitionRequest, pendingIntent10, asInterface11);
                                                                        parcel2.writeNoException();
                                                                        break;
                                                                    case TRANSACTION_removeActivityTransitionUpdates /* 73 */:
                                                                        PendingIntent pendingIntent11 = (PendingIntent) iax.a(parcel, PendingIntent.CREATOR);
                                                                        IStatusCallback asInterface12 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                                                                        enforceNoDataAvail(parcel);
                                                                        removeActivityTransitionUpdates(pendingIntent11, asInterface12);
                                                                        parcel2.writeNoException();
                                                                        break;
                                                                    case TRANSACTION_removeGeofenceByRemoveGeofencingRequest /* 74 */:
                                                                        RemoveGeofencingRequest removeGeofencingRequest = (RemoveGeofencingRequest) iax.a(parcel, RemoveGeofencingRequest.CREATOR);
                                                                        IGeofencerCallbacks asInterface13 = IGeofencerCallbacks.Stub.asInterface(parcel.readStrongBinder());
                                                                        enforceNoDataAvail(parcel);
                                                                        removeGeofenceByRemoveGeofencingRequest(removeGeofencingRequest, asInterface13);
                                                                        parcel2.writeNoException();
                                                                        break;
                                                                    case TRANSACTION_updateDeviceOrientationRequest /* 75 */:
                                                                        DeviceOrientationRequestUpdateData deviceOrientationRequestUpdateData = (DeviceOrientationRequestUpdateData) iax.a(parcel, DeviceOrientationRequestUpdateData.CREATOR);
                                                                        enforceNoDataAvail(parcel);
                                                                        updateDeviceOrientationRequest(deviceOrientationRequestUpdateData);
                                                                        parcel2.writeNoException();
                                                                        break;
                                                                    case TRANSACTION_requestPassiveWifiScans /* 76 */:
                                                                        PendingIntent pendingIntent12 = (PendingIntent) iax.a(parcel, PendingIntent.CREATOR);
                                                                        enforceNoDataAvail(parcel);
                                                                        requestPassiveWifiScans(pendingIntent12);
                                                                        parcel2.writeNoException();
                                                                        break;
                                                                    case TRANSACTION_setActivityRecognitionMode /* 77 */:
                                                                        int readInt = parcel.readInt();
                                                                        enforceNoDataAvail(parcel);
                                                                        boolean activityRecognitionMode = setActivityRecognitionMode(readInt);
                                                                        parcel2.writeNoException();
                                                                        int i3 = iax.a;
                                                                        parcel2.writeInt(activityRecognitionMode ? 1 : 0);
                                                                        break;
                                                                    case TRANSACTION_getActivityRecognitionMode /* 78 */:
                                                                        int activityRecognitionMode2 = getActivityRecognitionMode();
                                                                        parcel2.writeNoException();
                                                                        parcel2.writeInt(activityRecognitionMode2);
                                                                        break;
                                                                    case TRANSACTION_requestSleepSegments /* 79 */:
                                                                        PendingIntent pendingIntent13 = (PendingIntent) iax.a(parcel, PendingIntent.CREATOR);
                                                                        SleepSegmentRequest sleepSegmentRequest = (SleepSegmentRequest) iax.a(parcel, SleepSegmentRequest.CREATOR);
                                                                        IStatusCallback asInterface14 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                                                                        enforceNoDataAvail(parcel);
                                                                        requestSleepSegments(pendingIntent13, sleepSegmentRequest, asInterface14);
                                                                        parcel2.writeNoException();
                                                                        break;
                                                                    case TRANSACTION_getLastLocationWithAttribution /* 80 */:
                                                                        String readString3 = parcel.readString();
                                                                        enforceNoDataAvail(parcel);
                                                                        Location lastLocationWithAttribution = getLastLocationWithAttribution(readString3);
                                                                        parcel2.writeNoException();
                                                                        iax.e(parcel2, lastLocationWithAttribution);
                                                                        break;
                                                                    case TRANSACTION_getLastActivityWithFeature /* 81 */:
                                                                        String readString4 = parcel.readString();
                                                                        String readString5 = parcel.readString();
                                                                        enforceNoDataAvail(parcel);
                                                                        ActivityRecognitionResult lastActivityWithFeature = getLastActivityWithFeature(readString4, readString5);
                                                                        parcel2.writeNoException();
                                                                        iax.e(parcel2, lastActivityWithFeature);
                                                                        break;
                                                                    case TRANSACTION_getLastLocationWithRequest /* 82 */:
                                                                        LastLocationRequest lastLocationRequest = (LastLocationRequest) iax.a(parcel, LastLocationRequest.CREATOR);
                                                                        ILocationStatusCallback asInterface15 = ILocationStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                                                                        enforceNoDataAvail(parcel);
                                                                        getLastLocationWithRequest(lastLocationRequest, asInterface15);
                                                                        parcel2.writeNoException();
                                                                        break;
                                                                    default:
                                                                        switch (i) {
                                                                            case TRANSACTION_setMockModeWithCallback /* 84 */:
                                                                                boolean g3 = iax.g(parcel);
                                                                                IStatusCallback asInterface16 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                                                                                enforceNoDataAvail(parcel);
                                                                                setMockModeWithCallback(g3, asInterface16);
                                                                                parcel2.writeNoException();
                                                                                break;
                                                                            case TRANSACTION_setMockLocationWithCallback /* 85 */:
                                                                                Location location2 = (Location) iax.a(parcel, Location.CREATOR);
                                                                                IStatusCallback asInterface17 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                                                                                enforceNoDataAvail(parcel);
                                                                                setMockLocationWithCallback(location2, asInterface17);
                                                                                parcel2.writeNoException();
                                                                                break;
                                                                            case TRANSACTION_injectLocationWithCallback /* 86 */:
                                                                                Location location3 = (Location) iax.a(parcel, Location.CREATOR);
                                                                                int readInt2 = parcel.readInt();
                                                                                IStatusCallback asInterface18 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                                                                                enforceNoDataAvail(parcel);
                                                                                injectLocationWithCallback(location3, readInt2, asInterface18);
                                                                                parcel2.writeNoException();
                                                                                break;
                                                                            case TRANSACTION_getCurrentLocation /* 87 */:
                                                                                CurrentLocationRequest currentLocationRequest = (CurrentLocationRequest) iax.a(parcel, CurrentLocationRequest.CREATOR);
                                                                                ILocationStatusCallback asInterface19 = ILocationStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                                                                                enforceNoDataAvail(parcel);
                                                                                ICancelToken currentLocation = getCurrentLocation(currentLocationRequest, asInterface19);
                                                                                parcel2.writeNoException();
                                                                                iax.f(parcel2, currentLocation);
                                                                                break;
                                                                            case TRANSACTION_registerLocationClient /* 88 */:
                                                                                LocationReceiver locationReceiver = (LocationReceiver) iax.a(parcel, LocationReceiver.CREATOR);
                                                                                LocationRequest locationRequest3 = (LocationRequest) iax.a(parcel, LocationRequest.CREATOR);
                                                                                IStatusCallback asInterface20 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                                                                                enforceNoDataAvail(parcel);
                                                                                registerLocationClient(locationReceiver, locationRequest3, asInterface20);
                                                                                parcel2.writeNoException();
                                                                                break;
                                                                            case TRANSACTION_unregisterLocationClient /* 89 */:
                                                                                LocationReceiver locationReceiver2 = (LocationReceiver) iax.a(parcel, LocationReceiver.CREATOR);
                                                                                IStatusCallback asInterface21 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                                                                                enforceNoDataAvail(parcel);
                                                                                unregisterLocationClient(locationReceiver2, asInterface21);
                                                                                parcel2.writeNoException();
                                                                                break;
                                                                            case TRANSACTION_getLastLocationWithCallback /* 90 */:
                                                                                LastLocationRequest lastLocationRequest2 = (LastLocationRequest) iax.a(parcel, LastLocationRequest.CREATOR);
                                                                                LocationReceiver locationReceiver3 = (LocationReceiver) iax.a(parcel, LocationReceiver.CREATOR);
                                                                                enforceNoDataAvail(parcel);
                                                                                getLastLocationWithCallback(lastLocationRequest2, locationReceiver3);
                                                                                parcel2.writeNoException();
                                                                                break;
                                                                            case TRANSACTION_getLastAvailability /* 91 */:
                                                                                LocationAvailabilityRequest locationAvailabilityRequest = (LocationAvailabilityRequest) iax.a(parcel, LocationAvailabilityRequest.CREATOR);
                                                                                LocationReceiver locationReceiver4 = (LocationReceiver) iax.a(parcel, LocationReceiver.CREATOR);
                                                                                enforceNoDataAvail(parcel);
                                                                                getLastAvailability(locationAvailabilityRequest, locationReceiver4);
                                                                                parcel2.writeNoException();
                                                                                break;
                                                                            case TRANSACTION_getCurrentLocationWithCallback /* 92 */:
                                                                                CurrentLocationRequest currentLocationRequest2 = (CurrentLocationRequest) iax.a(parcel, CurrentLocationRequest.CREATOR);
                                                                                LocationReceiver locationReceiver5 = (LocationReceiver) iax.a(parcel, LocationReceiver.CREATOR);
                                                                                enforceNoDataAvail(parcel);
                                                                                ICancelToken currentLocationWithCallback = getCurrentLocationWithCallback(currentLocationRequest2, locationReceiver5);
                                                                                parcel2.writeNoException();
                                                                                iax.f(parcel2, currentLocationWithCallback);
                                                                                break;
                                                                            case TRANSACTION_registerDebugListener /* 93 */:
                                                                                IFlpDebugListener asInterface22 = IFlpDebugListener.Stub.asInterface(parcel.readStrongBinder());
                                                                                IStatusCallback asInterface23 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                                                                                enforceNoDataAvail(parcel);
                                                                                registerDebugListener(asInterface22, asInterface23);
                                                                                parcel2.writeNoException();
                                                                                break;
                                                                            case TRANSACTION_unregisterDebugListener /* 94 */:
                                                                                IFlpDebugListener asInterface24 = IFlpDebugListener.Stub.asInterface(parcel.readStrongBinder());
                                                                                IStatusCallback asInterface25 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                                                                                enforceNoDataAvail(parcel);
                                                                                unregisterDebugListener(asInterface24, asInterface25);
                                                                                parcel2.writeNoException();
                                                                                break;
                                                                            case TRANSACTION_isGoogleLocationAccuracyEnabled /* 95 */:
                                                                                IBooleanStatusCallback asInterface26 = IBooleanStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                                                                                enforceNoDataAvail(parcel);
                                                                                isGoogleLocationAccuracyEnabled(asInterface26);
                                                                                parcel2.writeNoException();
                                                                                break;
                                                                            case TRANSACTION_setGoogleLocationAccuracyEnabled /* 96 */:
                                                                                SetGoogleLocationAccuracyRequest setGoogleLocationAccuracyRequest = (SetGoogleLocationAccuracyRequest) iax.a(parcel, SetGoogleLocationAccuracyRequest.CREATOR);
                                                                                IStatusCallback asInterface27 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                                                                                enforceNoDataAvail(parcel);
                                                                                setGoogleLocationAccuracyEnabled(setGoogleLocationAccuracyRequest, asInterface27);
                                                                                parcel2.writeNoException();
                                                                                break;
                                                                            case TRANSACTION_addGeofences /* 97 */:
                                                                                GeofencingRequest geofencingRequest = (GeofencingRequest) iax.a(parcel, GeofencingRequest.CREATOR);
                                                                                PendingIntent pendingIntent14 = (PendingIntent) iax.a(parcel, PendingIntent.CREATOR);
                                                                                IStatusCallback asInterface28 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                                                                                enforceNoDataAvail(parcel);
                                                                                addGeofences(geofencingRequest, pendingIntent14, asInterface28);
                                                                                parcel2.writeNoException();
                                                                                break;
                                                                            case TRANSACTION_removeGeofences /* 98 */:
                                                                                RemoveGeofencingRequest removeGeofencingRequest2 = (RemoveGeofencingRequest) iax.a(parcel, RemoveGeofencingRequest.CREATOR);
                                                                                IStatusCallback asInterface29 = IStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                                                                                enforceNoDataAvail(parcel);
                                                                                removeGeofences(removeGeofencingRequest2, asInterface29);
                                                                                parcel2.writeNoException();
                                                                                break;
                                                                            case TRANSACTION_isLocationEnabled /* 99 */:
                                                                                IBooleanStatusCallback asInterface30 = IBooleanStatusCallback.Stub.asInterface(parcel.readStrongBinder());
                                                                                enforceNoDataAvail(parcel);
                                                                                isLocationEnabled(asInterface30);
                                                                                parcel2.writeNoException();
                                                                                break;
                                                                            default:
                                                                                return false;
                                                                        }
                                                                }
                                                        }
                                                    } else {
                                                        LocationRequestInternal locationRequestInternal = (LocationRequestInternal) iax.a(parcel, LocationRequestInternal.CREATOR);
                                                        PendingIntent pendingIntent15 = (PendingIntent) iax.a(parcel, PendingIntent.CREATOR);
                                                        enforceNoDataAvail(parcel);
                                                        requestLocationUpdatesInternalWithPendingIntent(locationRequestInternal, pendingIntent15);
                                                        parcel2.writeNoException();
                                                    }
                                                } else {
                                                    LocationRequestInternal locationRequestInternal2 = (LocationRequestInternal) iax.a(parcel, LocationRequestInternal.CREATOR);
                                                    ILocationListener asInterface31 = ILocationListener.Stub.asInterface(parcel.readStrongBinder());
                                                    enforceNoDataAvail(parcel);
                                                    requestLocationUpdatesInternal(locationRequestInternal2, asInterface31);
                                                    parcel2.writeNoException();
                                                }
                                            } else {
                                                LocationRequestUpdateData locationRequestUpdateData = (LocationRequestUpdateData) iax.a(parcel, LocationRequestUpdateData.CREATOR);
                                                enforceNoDataAvail(parcel);
                                                updateLocationRequest(locationRequestUpdateData);
                                                parcel2.writeNoException();
                                            }
                                        } else {
                                            GeofencingRequest geofencingRequest2 = (GeofencingRequest) iax.a(parcel, GeofencingRequest.CREATOR);
                                            PendingIntent pendingIntent16 = (PendingIntent) iax.a(parcel, PendingIntent.CREATOR);
                                            IGeofencerCallbacks asInterface32 = IGeofencerCallbacks.Stub.asInterface(parcel.readStrongBinder());
                                            enforceNoDataAvail(parcel);
                                            addGeofenceByGeofencingRequest(geofencingRequest2, pendingIntent16, asInterface32);
                                            parcel2.writeNoException();
                                        }
                                    } else {
                                        String readString6 = parcel.readString();
                                        enforceNoDataAvail(parcel);
                                        LocationAvailability lastAvailabilityWithPackage = getLastAvailabilityWithPackage(readString6);
                                        parcel2.writeNoException();
                                        iax.e(parcel2, lastAvailabilityWithPackage);
                                    }
                                } else {
                                    Location location4 = (Location) iax.a(parcel, Location.CREATOR);
                                    int readInt3 = parcel.readInt();
                                    enforceNoDataAvail(parcel);
                                    injectLocation(location4, readInt3);
                                    parcel2.writeNoException();
                                }
                            } else {
                                String readString7 = parcel.readString();
                                enforceNoDataAvail(parcel);
                                Location lastLocationWithPackage = getLastLocationWithPackage(readString7);
                                parcel2.writeNoException();
                                iax.e(parcel2, lastLocationWithPackage);
                            }
                        } else {
                            LocationRequest locationRequest4 = (LocationRequest) iax.a(parcel, LocationRequest.CREATOR);
                            ILocationListener asInterface33 = ILocationListener.Stub.asInterface(parcel.readStrongBinder());
                            String readString8 = parcel.readString();
                            enforceNoDataAvail(parcel);
                            requestLocationUpdatesWithPackage(locationRequest4, asInterface33, readString8);
                            parcel2.writeNoException();
                        }
                    } else {
                        String[] createStringArray = parcel.createStringArray();
                        IGeofencerCallbacks asInterface34 = IGeofencerCallbacks.Stub.asInterface(parcel.readStrongBinder());
                        String readString9 = parcel.readString();
                        enforceNoDataAvail(parcel);
                        removeGeofencesByRequestIds(createStringArray, asInterface34, readString9);
                        parcel2.writeNoException();
                    }
                } else {
                    PendingIntent pendingIntent17 = (PendingIntent) iax.a(parcel, PendingIntent.CREATOR);
                    IGeofencerCallbacks asInterface35 = IGeofencerCallbacks.Stub.asInterface(parcel.readStrongBinder());
                    String readString10 = parcel.readString();
                    enforceNoDataAvail(parcel);
                    removeGeofencesByPendingIntent(pendingIntent17, asInterface35, readString10);
                    parcel2.writeNoException();
                }
            } else {
                ArrayList createTypedArrayList = parcel.createTypedArrayList(ParcelableGeofence.CREATOR);
                PendingIntent pendingIntent18 = (PendingIntent) iax.a(parcel, PendingIntent.CREATOR);
                IGeofencerCallbacks asInterface36 = IGeofencerCallbacks.Stub.asInterface(parcel.readStrongBinder());
                String readString11 = parcel.readString();
                enforceNoDataAvail(parcel);
                addGeofence(createTypedArrayList, pendingIntent18, asInterface36, readString11);
                parcel2.writeNoException();
            }
            return true;
        }
    }

    @Deprecated
    void addGeofence(List<ParcelableGeofence> list, PendingIntent pendingIntent, IGeofencerCallbacks iGeofencerCallbacks, String str);

    @Deprecated
    void addGeofenceByGeofencingRequest(GeofencingRequest geofencingRequest, PendingIntent pendingIntent, IGeofencerCallbacks iGeofencerCallbacks);

    void addGeofences(GeofencingRequest geofencingRequest, PendingIntent pendingIntent, IStatusCallback iStatusCallback);

    void checkLocationSettings(LocationSettingsRequest locationSettingsRequest, ISettingsCallbacks iSettingsCallbacks, String str);

    void flushActivityRecognitionResults(IStatusCallback iStatusCallback);

    void flushLocations(IFusedLocationProviderCallback iFusedLocationProviderCallback);

    @Deprecated
    int getActivityRecognitionMode();

    @Deprecated
    ICancelToken getCurrentLocation(CurrentLocationRequest currentLocationRequest, ILocationStatusCallback iLocationStatusCallback);

    ICancelToken getCurrentLocationWithCallback(CurrentLocationRequest currentLocationRequest, LocationReceiver locationReceiver);

    @Deprecated
    ActivityRecognitionResult getLastActivity(String str);

    ActivityRecognitionResult getLastActivityWithFeature(String str, String str2);

    void getLastAvailability(LocationAvailabilityRequest locationAvailabilityRequest, LocationReceiver locationReceiver);

    @Deprecated
    LocationAvailability getLastAvailabilityWithPackage(String str);

    @Deprecated
    Location getLastLocation();

    @Deprecated
    Location getLastLocationWithAttribution(String str);

    void getLastLocationWithCallback(LastLocationRequest lastLocationRequest, LocationReceiver locationReceiver);

    @Deprecated
    Location getLastLocationWithPackage(String str);

    @Deprecated
    void getLastLocationWithRequest(LastLocationRequest lastLocationRequest, ILocationStatusCallback iLocationStatusCallback);

    @Deprecated
    void injectLocation(Location location, int i);

    void injectLocationWithCallback(Location location, int i, IStatusCallback iStatusCallback);

    void isGoogleLocationAccuracyEnabled(IBooleanStatusCallback iBooleanStatusCallback);

    void isLocationEnabled(IBooleanStatusCallback iBooleanStatusCallback);

    void registerDebugListener(IFlpDebugListener iFlpDebugListener, IStatusCallback iStatusCallback);

    void registerLocationClient(LocationReceiver locationReceiver, LocationRequest locationRequest, IStatusCallback iStatusCallback);

    void removeActivityTransitionUpdates(PendingIntent pendingIntent, IStatusCallback iStatusCallback);

    void removeActivityUpdates(PendingIntent pendingIntent);

    @Deprecated
    void removeFloorChangeUpdates(PendingIntent pendingIntent, IStatusCallback iStatusCallback);

    @Deprecated
    void removeGeofenceByRemoveGeofencingRequest(RemoveGeofencingRequest removeGeofencingRequest, IGeofencerCallbacks iGeofencerCallbacks);

    void removeGeofences(RemoveGeofencingRequest removeGeofencingRequest, IStatusCallback iStatusCallback);

    @Deprecated
    void removeGeofencesByPendingIntent(PendingIntent pendingIntent, IGeofencerCallbacks iGeofencerCallbacks, String str);

    @Deprecated
    void removeGeofencesByRequestIds(String[] strArr, IGeofencerCallbacks iGeofencerCallbacks, String str);

    @Deprecated
    void removeLocationUpdates(ILocationListener iLocationListener);

    @Deprecated
    void removeLocationUpdatesWithPendingIntent(PendingIntent pendingIntent);

    void removeSleepSegmentUpdates(PendingIntent pendingIntent, IStatusCallback iStatusCallback);

    void requestActivityTransitionUpdates(ActivityTransitionRequest activityTransitionRequest, PendingIntent pendingIntent, IStatusCallback iStatusCallback);

    void requestActivityUpdates(long j, boolean z, PendingIntent pendingIntent);

    void requestActivityUpdates2(ActivityRecognitionRequest activityRecognitionRequest, PendingIntent pendingIntent, IStatusCallback iStatusCallback);

    @Deprecated
    void requestFloorChangeUpdates(PendingIntent pendingIntent, IStatusCallback iStatusCallback);

    @Deprecated
    void requestLocationUpdates(LocationRequest locationRequest, ILocationListener iLocationListener);

    @Deprecated
    void requestLocationUpdatesInternal(LocationRequestInternal locationRequestInternal, ILocationListener iLocationListener);

    @Deprecated
    void requestLocationUpdatesInternalWithPendingIntent(LocationRequestInternal locationRequestInternal, PendingIntent pendingIntent);

    @Deprecated
    void requestLocationUpdatesWithPackage(LocationRequest locationRequest, ILocationListener iLocationListener, String str);

    @Deprecated
    void requestLocationUpdatesWithPendingIntent(LocationRequest locationRequest, PendingIntent pendingIntent);

    void requestPassiveWifiScans(PendingIntent pendingIntent);

    void requestSleepSegmentUpdates(PendingIntent pendingIntent, IStatusCallback iStatusCallback);

    void requestSleepSegments(PendingIntent pendingIntent, SleepSegmentRequest sleepSegmentRequest, IStatusCallback iStatusCallback);

    @Deprecated
    boolean setActivityRecognitionMode(int i);

    void setGoogleLocationAccuracyEnabled(SetGoogleLocationAccuracyRequest setGoogleLocationAccuracyRequest, IStatusCallback iStatusCallback);

    @Deprecated
    void setMockLocation(Location location);

    void setMockLocationWithCallback(Location location, IStatusCallback iStatusCallback);

    @Deprecated
    void setMockMode(boolean z);

    void setMockModeWithCallback(boolean z, IStatusCallback iStatusCallback);

    void unregisterDebugListener(IFlpDebugListener iFlpDebugListener, IStatusCallback iStatusCallback);

    void unregisterLocationClient(LocationReceiver locationReceiver, IStatusCallback iStatusCallback);

    void updateDeviceOrientationRequest(DeviceOrientationRequestUpdateData deviceOrientationRequestUpdateData);

    @Deprecated
    void updateLocationRequest(LocationRequestUpdateData locationRequestUpdateData);
}
