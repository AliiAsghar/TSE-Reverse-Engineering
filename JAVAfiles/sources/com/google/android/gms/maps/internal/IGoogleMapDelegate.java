package com.google.android.gms.maps.internal;

import android.location.Location;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.aidl.BaseProxy;
import com.google.android.aidl.BaseStub;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.maps.internal.ICancelableCallback;
import com.google.android.gms.maps.internal.IInfoWindowAdapter;
import com.google.android.gms.maps.internal.ILocationSourceDelegate;
import com.google.android.gms.maps.internal.IOnCameraChangeListener;
import com.google.android.gms.maps.internal.IOnCameraIdleListener;
import com.google.android.gms.maps.internal.IOnCameraMoveCanceledListener;
import com.google.android.gms.maps.internal.IOnCameraMoveListener;
import com.google.android.gms.maps.internal.IOnCameraMoveStartedListener;
import com.google.android.gms.maps.internal.IOnCircleClickListener;
import com.google.android.gms.maps.internal.IOnGroundOverlayClickListener;
import com.google.android.gms.maps.internal.IOnIndoorStateChangeListener;
import com.google.android.gms.maps.internal.IOnInfoWindowClickListener;
import com.google.android.gms.maps.internal.IOnInfoWindowCloseListener;
import com.google.android.gms.maps.internal.IOnInfoWindowLongClickListener;
import com.google.android.gms.maps.internal.IOnMapCapabilitiesChangedListener;
import com.google.android.gms.maps.internal.IOnMapClickListener;
import com.google.android.gms.maps.internal.IOnMapLoadedCallback;
import com.google.android.gms.maps.internal.IOnMapLongClickListener;
import com.google.android.gms.maps.internal.IOnMapReadyCallback;
import com.google.android.gms.maps.internal.IOnMarkerClickListener;
import com.google.android.gms.maps.internal.IOnMarkerDragListener;
import com.google.android.gms.maps.internal.IOnMyLocationButtonClickListener;
import com.google.android.gms.maps.internal.IOnMyLocationChangeListener;
import com.google.android.gms.maps.internal.IOnMyLocationClickListener;
import com.google.android.gms.maps.internal.IOnPoiClickListener;
import com.google.android.gms.maps.internal.IOnPolygonClickListener;
import com.google.android.gms.maps.internal.IOnPolylineClickListener;
import com.google.android.gms.maps.internal.IProjectionDelegate;
import com.google.android.gms.maps.internal.ISnapshotReadyCallback;
import com.google.android.gms.maps.internal.IUiSettingsDelegate;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.FeatureLayerOptions;
import com.google.android.gms.maps.model.GroundOverlayOptions;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.MapStyleOptions;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolygonOptions;
import com.google.android.gms.maps.model.PolylineOptions;
import com.google.android.gms.maps.model.TileOverlayOptions;
import com.google.android.gms.maps.model.internal.ICircleDelegate;
import com.google.android.gms.maps.model.internal.IFeatureLayerDelegate;
import com.google.android.gms.maps.model.internal.IGroundOverlayDelegate;
import com.google.android.gms.maps.model.internal.IIndoorBuildingDelegate;
import com.google.android.gms.maps.model.internal.IMapCapabilitiesDelegate;
import com.google.android.gms.maps.model.internal.IMarkerDelegate;
import com.google.android.gms.maps.model.internal.IPolygonDelegate;
import com.google.android.gms.maps.model.internal.IPolylineDelegate;
import com.google.android.gms.maps.model.internal.ITileOverlayDelegate;
import defpackage.iax;

/* compiled from: PG */
/* loaded from: classes2.dex */
public interface IGoogleMapDelegate extends IInterface {

    /* compiled from: PG */
    /* loaded from: classes2.dex */
    public static abstract class Stub extends BaseStub implements IGoogleMapDelegate {
        static final int TRANSACTION_addCircle = 35;
        static final int TRANSACTION_addGroundOverlay = 12;
        static final int TRANSACTION_addMarker = 11;
        static final int TRANSACTION_addOnMapCapabilitiesChangedListener = 110;
        static final int TRANSACTION_addPolygon = 10;
        static final int TRANSACTION_addPolyline = 9;
        static final int TRANSACTION_addTileOverlay = 13;
        static final int TRANSACTION_animateCamera = 5;
        static final int TRANSACTION_animateCameraWithCallback = 6;
        static final int TRANSACTION_animateCameraWithDurationAndCallback = 7;
        static final int TRANSACTION_clear = 14;
        static final int TRANSACTION_getCameraPosition = 1;
        static final int TRANSACTION_getFeatureLayer = 112;
        static final int TRANSACTION_getFocusedBuilding = 44;
        static final int TRANSACTION_getMapAsync = 53;
        static final int TRANSACTION_getMapCapabilities = 109;
        static final int TRANSACTION_getMapColorScheme = 114;
        static final int TRANSACTION_getMapType = 15;
        static final int TRANSACTION_getMaxZoomLevel = 2;
        static final int TRANSACTION_getMinZoomLevel = 3;
        static final int TRANSACTION_getMyLocation = 23;
        static final int TRANSACTION_getProjection = 26;
        static final int TRANSACTION_getUiSettings = 25;
        static final int TRANSACTION_isBuildingsEnabled = 40;
        static final int TRANSACTION_isIndoorEnabled = 19;
        static final int TRANSACTION_isMyLocationEnabled = 21;
        static final int TRANSACTION_isTrafficEnabled = 17;
        static final int TRANSACTION_moveCamera = 4;
        static final int TRANSACTION_onCreate = 54;
        static final int TRANSACTION_onDestroy = 57;
        static final int TRANSACTION_onEnterAmbient = 81;
        static final int TRANSACTION_onExitAmbient = 82;
        static final int TRANSACTION_onLowMemory = 58;
        static final int TRANSACTION_onPause = 56;
        static final int TRANSACTION_onResume = 55;
        static final int TRANSACTION_onSaveInstanceState = 60;
        static final int TRANSACTION_onStart = 101;
        static final int TRANSACTION_onStop = 102;
        static final int TRANSACTION_removeOnMapCapabilitiesChangedListener = 111;
        static final int TRANSACTION_resetMinMaxZoomPreference = 94;
        static final int TRANSACTION_setBuildingsEnabled = 41;
        static final int TRANSACTION_setContentDescription = 61;
        static final int TRANSACTION_setIndoorEnabled = 20;
        static final int TRANSACTION_setInfoWindowAdapter = 33;
        static final int TRANSACTION_setLatLngBoundsForCameraTarget = 95;
        static final int TRANSACTION_setLocationSource = 24;
        static final int TRANSACTION_setMapColorScheme = 113;
        static final int TRANSACTION_setMapStyle = 91;
        static final int TRANSACTION_setMapType = 16;
        static final int TRANSACTION_setMaxZoomPreference = 93;
        static final int TRANSACTION_setMinZoomPreference = 92;
        static final int TRANSACTION_setMyLocationEnabled = 22;
        static final int TRANSACTION_setOnCameraChangeListener = 27;
        static final int TRANSACTION_setOnCameraIdleListener = 99;
        static final int TRANSACTION_setOnCameraMoveCanceledListener = 98;
        static final int TRANSACTION_setOnCameraMoveListener = 97;
        static final int TRANSACTION_setOnCameraMoveStartedListener = 96;
        static final int TRANSACTION_setOnCircleClickListener = 89;
        static final int TRANSACTION_setOnGroundOverlayClickListener = 83;
        static final int TRANSACTION_setOnIndoorStateChangeListener = 45;
        static final int TRANSACTION_setOnInfoWindowClickListener = 32;
        static final int TRANSACTION_setOnInfoWindowCloseListener = 86;
        static final int TRANSACTION_setOnInfoWindowLongClickListener = 84;
        static final int TRANSACTION_setOnMapClickListener = 28;
        static final int TRANSACTION_setOnMapLoadedCallback = 42;
        static final int TRANSACTION_setOnMapLongClickListener = 29;
        static final int TRANSACTION_setOnMarkerClickListener = 30;
        static final int TRANSACTION_setOnMarkerDragListener = 31;
        static final int TRANSACTION_setOnMyLocationButtonClickListener = 37;
        static final int TRANSACTION_setOnMyLocationChangeListener = 36;
        static final int TRANSACTION_setOnMyLocationClickListener = 107;
        static final int TRANSACTION_setOnPoiClickListener = 80;
        static final int TRANSACTION_setOnPolygonClickListener = 85;
        static final int TRANSACTION_setOnPolylineClickListener = 87;
        static final int TRANSACTION_setPadding = 39;
        static final int TRANSACTION_setTrafficEnabled = 18;
        static final int TRANSACTION_setWatermarkEnabled = 51;
        static final int TRANSACTION_snapshot = 38;
        static final int TRANSACTION_snapshotForTest = 71;
        static final int TRANSACTION_stopAnimation = 8;
        static final int TRANSACTION_useViewLifecycleWhenInFragment = 59;

        /* compiled from: PG */
        /* loaded from: classes2.dex */
        public static class Proxy extends BaseProxy implements IGoogleMapDelegate {
            public Proxy(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.maps.internal.IGoogleMapDelegate");
            }

            @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public ICircleDelegate addCircle(CircleOptions circleOptions) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, circleOptions);
                Parcel transactAndReadException = transactAndReadException(35, obtainAndWriteInterfaceToken);
                ICircleDelegate asInterface = ICircleDelegate.Stub.asInterface(transactAndReadException.readStrongBinder());
                transactAndReadException.recycle();
                return asInterface;
            }

            @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public IGroundOverlayDelegate addGroundOverlay(GroundOverlayOptions groundOverlayOptions) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, groundOverlayOptions);
                Parcel transactAndReadException = transactAndReadException(12, obtainAndWriteInterfaceToken);
                IGroundOverlayDelegate asInterface = IGroundOverlayDelegate.Stub.asInterface(transactAndReadException.readStrongBinder());
                transactAndReadException.recycle();
                return asInterface;
            }

            @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public IMarkerDelegate addMarker(MarkerOptions markerOptions) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, markerOptions);
                Parcel transactAndReadException = transactAndReadException(11, obtainAndWriteInterfaceToken);
                IMarkerDelegate asInterface = IMarkerDelegate.Stub.asInterface(transactAndReadException.readStrongBinder());
                transactAndReadException.recycle();
                return asInterface;
            }

            @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public void addOnMapCapabilitiesChangedListener(IOnMapCapabilitiesChangedListener iOnMapCapabilitiesChangedListener) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iOnMapCapabilitiesChangedListener);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_addOnMapCapabilitiesChangedListener, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public IPolygonDelegate addPolygon(PolygonOptions polygonOptions) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, polygonOptions);
                Parcel transactAndReadException = transactAndReadException(10, obtainAndWriteInterfaceToken);
                IPolygonDelegate asInterface = IPolygonDelegate.Stub.asInterface(transactAndReadException.readStrongBinder());
                transactAndReadException.recycle();
                return asInterface;
            }

            @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public IPolylineDelegate addPolyline(PolylineOptions polylineOptions) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, polylineOptions);
                Parcel transactAndReadException = transactAndReadException(9, obtainAndWriteInterfaceToken);
                IPolylineDelegate asInterface = IPolylineDelegate.Stub.asInterface(transactAndReadException.readStrongBinder());
                transactAndReadException.recycle();
                return asInterface;
            }

            @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public ITileOverlayDelegate addTileOverlay(TileOverlayOptions tileOverlayOptions) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, tileOverlayOptions);
                Parcel transactAndReadException = transactAndReadException(13, obtainAndWriteInterfaceToken);
                ITileOverlayDelegate asInterface = ITileOverlayDelegate.Stub.asInterface(transactAndReadException.readStrongBinder());
                transactAndReadException.recycle();
                return asInterface;
            }

            @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public void animateCamera(IObjectWrapper iObjectWrapper) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iObjectWrapper);
                transactAndReadExceptionReturnVoid(5, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public void animateCameraWithCallback(IObjectWrapper iObjectWrapper, ICancelableCallback iCancelableCallback) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iObjectWrapper);
                iax.f(obtainAndWriteInterfaceToken, iCancelableCallback);
                transactAndReadExceptionReturnVoid(6, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public void animateCameraWithDurationAndCallback(IObjectWrapper iObjectWrapper, int i, ICancelableCallback iCancelableCallback) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iObjectWrapper);
                obtainAndWriteInterfaceToken.writeInt(i);
                iax.f(obtainAndWriteInterfaceToken, iCancelableCallback);
                transactAndReadExceptionReturnVoid(7, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public void clear() {
                transactAndReadExceptionReturnVoid(14, obtainAndWriteInterfaceToken());
            }

            @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public CameraPosition getCameraPosition() {
                Parcel transactAndReadException = transactAndReadException(1, obtainAndWriteInterfaceToken());
                CameraPosition cameraPosition = (CameraPosition) iax.a(transactAndReadException, CameraPosition.CREATOR);
                transactAndReadException.recycle();
                return cameraPosition;
            }

            @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public IFeatureLayerDelegate getFeatureLayer(FeatureLayerOptions featureLayerOptions) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, featureLayerOptions);
                Parcel transactAndReadException = transactAndReadException(Stub.TRANSACTION_getFeatureLayer, obtainAndWriteInterfaceToken);
                IFeatureLayerDelegate asInterface = IFeatureLayerDelegate.Stub.asInterface(transactAndReadException.readStrongBinder());
                transactAndReadException.recycle();
                return asInterface;
            }

            @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public IIndoorBuildingDelegate getFocusedBuilding() {
                Parcel transactAndReadException = transactAndReadException(44, obtainAndWriteInterfaceToken());
                IIndoorBuildingDelegate asInterface = IIndoorBuildingDelegate.Stub.asInterface(transactAndReadException.readStrongBinder());
                transactAndReadException.recycle();
                return asInterface;
            }

            @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public void getMapAsync(IOnMapReadyCallback iOnMapReadyCallback) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iOnMapReadyCallback);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_getMapAsync, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public IMapCapabilitiesDelegate getMapCapabilities() {
                Parcel transactAndReadException = transactAndReadException(Stub.TRANSACTION_getMapCapabilities, obtainAndWriteInterfaceToken());
                IMapCapabilitiesDelegate asInterface = IMapCapabilitiesDelegate.Stub.asInterface(transactAndReadException.readStrongBinder());
                transactAndReadException.recycle();
                return asInterface;
            }

            @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public int getMapColorScheme() {
                Parcel transactAndReadException = transactAndReadException(Stub.TRANSACTION_getMapColorScheme, obtainAndWriteInterfaceToken());
                int readInt = transactAndReadException.readInt();
                transactAndReadException.recycle();
                return readInt;
            }

            @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public int getMapType() {
                Parcel transactAndReadException = transactAndReadException(15, obtainAndWriteInterfaceToken());
                int readInt = transactAndReadException.readInt();
                transactAndReadException.recycle();
                return readInt;
            }

            @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public float getMaxZoomLevel() {
                Parcel transactAndReadException = transactAndReadException(2, obtainAndWriteInterfaceToken());
                float readFloat = transactAndReadException.readFloat();
                transactAndReadException.recycle();
                return readFloat;
            }

            @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public float getMinZoomLevel() {
                Parcel transactAndReadException = transactAndReadException(3, obtainAndWriteInterfaceToken());
                float readFloat = transactAndReadException.readFloat();
                transactAndReadException.recycle();
                return readFloat;
            }

            @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public Location getMyLocation() {
                Parcel transactAndReadException = transactAndReadException(23, obtainAndWriteInterfaceToken());
                Location location = (Location) iax.a(transactAndReadException, Location.CREATOR);
                transactAndReadException.recycle();
                return location;
            }

            @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public IProjectionDelegate getProjection() {
                Parcel transactAndReadException = transactAndReadException(26, obtainAndWriteInterfaceToken());
                IProjectionDelegate asInterface = IProjectionDelegate.Stub.asInterface(transactAndReadException.readStrongBinder());
                transactAndReadException.recycle();
                return asInterface;
            }

            @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public IUiSettingsDelegate getUiSettings() {
                Parcel transactAndReadException = transactAndReadException(25, obtainAndWriteInterfaceToken());
                IUiSettingsDelegate asInterface = IUiSettingsDelegate.Stub.asInterface(transactAndReadException.readStrongBinder());
                transactAndReadException.recycle();
                return asInterface;
            }

            @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public boolean isBuildingsEnabled() {
                Parcel transactAndReadException = transactAndReadException(40, obtainAndWriteInterfaceToken());
                boolean g = iax.g(transactAndReadException);
                transactAndReadException.recycle();
                return g;
            }

            @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public boolean isIndoorEnabled() {
                Parcel transactAndReadException = transactAndReadException(19, obtainAndWriteInterfaceToken());
                boolean g = iax.g(transactAndReadException);
                transactAndReadException.recycle();
                return g;
            }

            @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public boolean isMyLocationEnabled() {
                Parcel transactAndReadException = transactAndReadException(21, obtainAndWriteInterfaceToken());
                boolean g = iax.g(transactAndReadException);
                transactAndReadException.recycle();
                return g;
            }

            @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public boolean isTrafficEnabled() {
                Parcel transactAndReadException = transactAndReadException(17, obtainAndWriteInterfaceToken());
                boolean g = iax.g(transactAndReadException);
                transactAndReadException.recycle();
                return g;
            }

            @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public void moveCamera(IObjectWrapper iObjectWrapper) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iObjectWrapper);
                transactAndReadExceptionReturnVoid(4, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public void onCreate(Bundle bundle) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, bundle);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_onCreate, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public void onDestroy() {
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_onDestroy, obtainAndWriteInterfaceToken());
            }

            @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public void onEnterAmbient(Bundle bundle) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, bundle);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_onEnterAmbient, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public void onExitAmbient() {
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_onExitAmbient, obtainAndWriteInterfaceToken());
            }

            @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public void onLowMemory() {
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_onLowMemory, obtainAndWriteInterfaceToken());
            }

            @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public void onPause() {
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_onPause, obtainAndWriteInterfaceToken());
            }

            @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public void onResume() {
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_onResume, obtainAndWriteInterfaceToken());
            }

            @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public void onSaveInstanceState(Bundle bundle) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, bundle);
                Parcel transactAndReadException = transactAndReadException(Stub.TRANSACTION_onSaveInstanceState, obtainAndWriteInterfaceToken);
                if (transactAndReadException.readInt() != 0) {
                    bundle.readFromParcel(transactAndReadException);
                }
                transactAndReadException.recycle();
            }

            @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public void onStart() {
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_onStart, obtainAndWriteInterfaceToken());
            }

            @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public void onStop() {
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_onStop, obtainAndWriteInterfaceToken());
            }

            @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public void removeOnMapCapabilitiesChangedListener(IOnMapCapabilitiesChangedListener iOnMapCapabilitiesChangedListener) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iOnMapCapabilitiesChangedListener);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_removeOnMapCapabilitiesChangedListener, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public void resetMinMaxZoomPreference() {
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_resetMinMaxZoomPreference, obtainAndWriteInterfaceToken());
            }

            @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public void setBuildingsEnabled(boolean z) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                int i = iax.a;
                obtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                transactAndReadExceptionReturnVoid(41, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public void setContentDescription(String str) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeString(str);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_setContentDescription, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public boolean setIndoorEnabled(boolean z) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                int i = iax.a;
                obtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                Parcel transactAndReadException = transactAndReadException(20, obtainAndWriteInterfaceToken);
                boolean g = iax.g(transactAndReadException);
                transactAndReadException.recycle();
                return g;
            }

            @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public void setInfoWindowAdapter(IInfoWindowAdapter iInfoWindowAdapter) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iInfoWindowAdapter);
                transactAndReadExceptionReturnVoid(33, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public void setLatLngBoundsForCameraTarget(LatLngBounds latLngBounds) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, latLngBounds);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_setLatLngBoundsForCameraTarget, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public void setLocationSource(ILocationSourceDelegate iLocationSourceDelegate) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iLocationSourceDelegate);
                transactAndReadExceptionReturnVoid(24, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public void setMapColorScheme(int i) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeInt(i);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_setMapColorScheme, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public boolean setMapStyle(MapStyleOptions mapStyleOptions) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.d(obtainAndWriteInterfaceToken, mapStyleOptions);
                Parcel transactAndReadException = transactAndReadException(Stub.TRANSACTION_setMapStyle, obtainAndWriteInterfaceToken);
                boolean g = iax.g(transactAndReadException);
                transactAndReadException.recycle();
                return g;
            }

            @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public void setMapType(int i) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeInt(i);
                transactAndReadExceptionReturnVoid(16, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public void setMaxZoomPreference(float f) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeFloat(f);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_setMaxZoomPreference, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public void setMinZoomPreference(float f) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeFloat(f);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_setMinZoomPreference, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public void setMyLocationEnabled(boolean z) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                int i = iax.a;
                obtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                transactAndReadExceptionReturnVoid(22, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public void setOnCameraChangeListener(IOnCameraChangeListener iOnCameraChangeListener) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iOnCameraChangeListener);
                transactAndReadExceptionReturnVoid(27, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public void setOnCameraIdleListener(IOnCameraIdleListener iOnCameraIdleListener) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iOnCameraIdleListener);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_setOnCameraIdleListener, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public void setOnCameraMoveCanceledListener(IOnCameraMoveCanceledListener iOnCameraMoveCanceledListener) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iOnCameraMoveCanceledListener);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_setOnCameraMoveCanceledListener, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public void setOnCameraMoveListener(IOnCameraMoveListener iOnCameraMoveListener) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iOnCameraMoveListener);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_setOnCameraMoveListener, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public void setOnCameraMoveStartedListener(IOnCameraMoveStartedListener iOnCameraMoveStartedListener) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iOnCameraMoveStartedListener);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_setOnCameraMoveStartedListener, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public void setOnCircleClickListener(IOnCircleClickListener iOnCircleClickListener) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iOnCircleClickListener);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_setOnCircleClickListener, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public void setOnGroundOverlayClickListener(IOnGroundOverlayClickListener iOnGroundOverlayClickListener) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iOnGroundOverlayClickListener);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_setOnGroundOverlayClickListener, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public void setOnIndoorStateChangeListener(IOnIndoorStateChangeListener iOnIndoorStateChangeListener) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iOnIndoorStateChangeListener);
                transactAndReadExceptionReturnVoid(45, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public void setOnInfoWindowClickListener(IOnInfoWindowClickListener iOnInfoWindowClickListener) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iOnInfoWindowClickListener);
                transactAndReadExceptionReturnVoid(32, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public void setOnInfoWindowCloseListener(IOnInfoWindowCloseListener iOnInfoWindowCloseListener) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iOnInfoWindowCloseListener);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_setOnInfoWindowCloseListener, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public void setOnInfoWindowLongClickListener(IOnInfoWindowLongClickListener iOnInfoWindowLongClickListener) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iOnInfoWindowLongClickListener);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_setOnInfoWindowLongClickListener, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public void setOnMapClickListener(IOnMapClickListener iOnMapClickListener) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iOnMapClickListener);
                transactAndReadExceptionReturnVoid(28, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public void setOnMapLoadedCallback(IOnMapLoadedCallback iOnMapLoadedCallback) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iOnMapLoadedCallback);
                transactAndReadExceptionReturnVoid(42, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public void setOnMapLongClickListener(IOnMapLongClickListener iOnMapLongClickListener) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iOnMapLongClickListener);
                transactAndReadExceptionReturnVoid(29, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public void setOnMarkerClickListener(IOnMarkerClickListener iOnMarkerClickListener) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iOnMarkerClickListener);
                transactAndReadExceptionReturnVoid(30, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public void setOnMarkerDragListener(IOnMarkerDragListener iOnMarkerDragListener) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iOnMarkerDragListener);
                transactAndReadExceptionReturnVoid(31, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public void setOnMyLocationButtonClickListener(IOnMyLocationButtonClickListener iOnMyLocationButtonClickListener) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iOnMyLocationButtonClickListener);
                transactAndReadExceptionReturnVoid(37, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public void setOnMyLocationChangeListener(IOnMyLocationChangeListener iOnMyLocationChangeListener) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iOnMyLocationChangeListener);
                transactAndReadExceptionReturnVoid(36, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public void setOnMyLocationClickListener(IOnMyLocationClickListener iOnMyLocationClickListener) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iOnMyLocationClickListener);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_setOnMyLocationClickListener, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public void setOnPoiClickListener(IOnPoiClickListener iOnPoiClickListener) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iOnPoiClickListener);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_setOnPoiClickListener, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public void setOnPolygonClickListener(IOnPolygonClickListener iOnPolygonClickListener) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iOnPolygonClickListener);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_setOnPolygonClickListener, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public void setOnPolylineClickListener(IOnPolylineClickListener iOnPolylineClickListener) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iOnPolylineClickListener);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_setOnPolylineClickListener, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public void setPadding(int i, int i2, int i3, int i4) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                obtainAndWriteInterfaceToken.writeInt(i);
                obtainAndWriteInterfaceToken.writeInt(i2);
                obtainAndWriteInterfaceToken.writeInt(i3);
                obtainAndWriteInterfaceToken.writeInt(i4);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_setPadding, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public void setTrafficEnabled(boolean z) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                int i = iax.a;
                obtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                transactAndReadExceptionReturnVoid(18, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public void setWatermarkEnabled(boolean z) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                int i = iax.a;
                obtainAndWriteInterfaceToken.writeInt(z ? 1 : 0);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_setWatermarkEnabled, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public void snapshot(ISnapshotReadyCallback iSnapshotReadyCallback, IObjectWrapper iObjectWrapper) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iSnapshotReadyCallback);
                iax.f(obtainAndWriteInterfaceToken, iObjectWrapper);
                transactAndReadExceptionReturnVoid(38, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public void snapshotForTest(ISnapshotReadyCallback iSnapshotReadyCallback) {
                Parcel obtainAndWriteInterfaceToken = obtainAndWriteInterfaceToken();
                iax.f(obtainAndWriteInterfaceToken, iSnapshotReadyCallback);
                transactAndReadExceptionReturnVoid(Stub.TRANSACTION_snapshotForTest, obtainAndWriteInterfaceToken);
            }

            @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public void stopAnimation() {
                transactAndReadExceptionReturnVoid(8, obtainAndWriteInterfaceToken());
            }

            @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
            public boolean useViewLifecycleWhenInFragment() {
                Parcel transactAndReadException = transactAndReadException(Stub.TRANSACTION_useViewLifecycleWhenInFragment, obtainAndWriteInterfaceToken());
                boolean g = iax.g(transactAndReadException);
                transactAndReadException.recycle();
                return g;
            }
        }

        public Stub() {
            super("com.google.android.gms.maps.internal.IGoogleMapDelegate");
        }

        public static IGoogleMapDelegate asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            if (queryLocalInterface instanceof IGoogleMapDelegate) {
                return (IGoogleMapDelegate) queryLocalInterface;
            }
            return new Proxy(iBinder);
        }

        @Override // com.google.android.aidl.BaseStub
        protected boolean dispatchTransaction(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 44) {
                if (i != 45) {
                    if (i != TRANSACTION_setWatermarkEnabled) {
                        if (i != TRANSACTION_snapshotForTest) {
                            if (i != TRANSACTION_setOnCircleClickListener) {
                                if (i != TRANSACTION_setOnMyLocationClickListener) {
                                    if (i != TRANSACTION_onStart) {
                                        if (i != TRANSACTION_onStop) {
                                            switch (i) {
                                                case 1:
                                                    CameraPosition cameraPosition = getCameraPosition();
                                                    parcel2.writeNoException();
                                                    iax.e(parcel2, cameraPosition);
                                                    return true;
                                                case 2:
                                                    float maxZoomLevel = getMaxZoomLevel();
                                                    parcel2.writeNoException();
                                                    parcel2.writeFloat(maxZoomLevel);
                                                    return true;
                                                case 3:
                                                    float minZoomLevel = getMinZoomLevel();
                                                    parcel2.writeNoException();
                                                    parcel2.writeFloat(minZoomLevel);
                                                    return true;
                                                case 4:
                                                    IObjectWrapper asInterface = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                                                    enforceNoDataAvail(parcel);
                                                    moveCamera(asInterface);
                                                    parcel2.writeNoException();
                                                    return true;
                                                case 5:
                                                    IObjectWrapper asInterface2 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                                                    enforceNoDataAvail(parcel);
                                                    animateCamera(asInterface2);
                                                    parcel2.writeNoException();
                                                    return true;
                                                case 6:
                                                    IObjectWrapper asInterface3 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                                                    ICancelableCallback asInterface4 = ICancelableCallback.Stub.asInterface(parcel.readStrongBinder());
                                                    enforceNoDataAvail(parcel);
                                                    animateCameraWithCallback(asInterface3, asInterface4);
                                                    parcel2.writeNoException();
                                                    return true;
                                                case 7:
                                                    IObjectWrapper asInterface5 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                                                    int readInt = parcel.readInt();
                                                    ICancelableCallback asInterface6 = ICancelableCallback.Stub.asInterface(parcel.readStrongBinder());
                                                    enforceNoDataAvail(parcel);
                                                    animateCameraWithDurationAndCallback(asInterface5, readInt, asInterface6);
                                                    parcel2.writeNoException();
                                                    return true;
                                                case 8:
                                                    stopAnimation();
                                                    parcel2.writeNoException();
                                                    return true;
                                                case 9:
                                                    PolylineOptions polylineOptions = (PolylineOptions) iax.a(parcel, PolylineOptions.CREATOR);
                                                    enforceNoDataAvail(parcel);
                                                    IPolylineDelegate addPolyline = addPolyline(polylineOptions);
                                                    parcel2.writeNoException();
                                                    iax.f(parcel2, addPolyline);
                                                    return true;
                                                case 10:
                                                    PolygonOptions polygonOptions = (PolygonOptions) iax.a(parcel, PolygonOptions.CREATOR);
                                                    enforceNoDataAvail(parcel);
                                                    IPolygonDelegate addPolygon = addPolygon(polygonOptions);
                                                    parcel2.writeNoException();
                                                    iax.f(parcel2, addPolygon);
                                                    return true;
                                                case 11:
                                                    MarkerOptions markerOptions = (MarkerOptions) iax.a(parcel, MarkerOptions.CREATOR);
                                                    enforceNoDataAvail(parcel);
                                                    IMarkerDelegate addMarker = addMarker(markerOptions);
                                                    parcel2.writeNoException();
                                                    iax.f(parcel2, addMarker);
                                                    return true;
                                                case 12:
                                                    GroundOverlayOptions groundOverlayOptions = (GroundOverlayOptions) iax.a(parcel, GroundOverlayOptions.CREATOR);
                                                    enforceNoDataAvail(parcel);
                                                    IGroundOverlayDelegate addGroundOverlay = addGroundOverlay(groundOverlayOptions);
                                                    parcel2.writeNoException();
                                                    iax.f(parcel2, addGroundOverlay);
                                                    return true;
                                                case 13:
                                                    TileOverlayOptions tileOverlayOptions = (TileOverlayOptions) iax.a(parcel, TileOverlayOptions.CREATOR);
                                                    enforceNoDataAvail(parcel);
                                                    ITileOverlayDelegate addTileOverlay = addTileOverlay(tileOverlayOptions);
                                                    parcel2.writeNoException();
                                                    iax.f(parcel2, addTileOverlay);
                                                    return true;
                                                case 14:
                                                    clear();
                                                    parcel2.writeNoException();
                                                    return true;
                                                case 15:
                                                    int mapType = getMapType();
                                                    parcel2.writeNoException();
                                                    parcel2.writeInt(mapType);
                                                    return true;
                                                case 16:
                                                    int readInt2 = parcel.readInt();
                                                    enforceNoDataAvail(parcel);
                                                    setMapType(readInt2);
                                                    parcel2.writeNoException();
                                                    return true;
                                                case 17:
                                                    boolean isTrafficEnabled = isTrafficEnabled();
                                                    parcel2.writeNoException();
                                                    int i3 = iax.a;
                                                    parcel2.writeInt(isTrafficEnabled ? 1 : 0);
                                                    return true;
                                                case 18:
                                                    boolean g = iax.g(parcel);
                                                    enforceNoDataAvail(parcel);
                                                    setTrafficEnabled(g);
                                                    parcel2.writeNoException();
                                                    return true;
                                                case 19:
                                                    boolean isIndoorEnabled = isIndoorEnabled();
                                                    parcel2.writeNoException();
                                                    int i4 = iax.a;
                                                    parcel2.writeInt(isIndoorEnabled ? 1 : 0);
                                                    return true;
                                                case 20:
                                                    boolean g2 = iax.g(parcel);
                                                    enforceNoDataAvail(parcel);
                                                    boolean indoorEnabled = setIndoorEnabled(g2);
                                                    parcel2.writeNoException();
                                                    parcel2.writeInt(indoorEnabled ? 1 : 0);
                                                    return true;
                                                case 21:
                                                    boolean isMyLocationEnabled = isMyLocationEnabled();
                                                    parcel2.writeNoException();
                                                    int i5 = iax.a;
                                                    parcel2.writeInt(isMyLocationEnabled ? 1 : 0);
                                                    return true;
                                                case 22:
                                                    boolean g3 = iax.g(parcel);
                                                    enforceNoDataAvail(parcel);
                                                    setMyLocationEnabled(g3);
                                                    parcel2.writeNoException();
                                                    return true;
                                                case 23:
                                                    Location myLocation = getMyLocation();
                                                    parcel2.writeNoException();
                                                    iax.e(parcel2, myLocation);
                                                    return true;
                                                case 24:
                                                    ILocationSourceDelegate asInterface7 = ILocationSourceDelegate.Stub.asInterface(parcel.readStrongBinder());
                                                    enforceNoDataAvail(parcel);
                                                    setLocationSource(asInterface7);
                                                    parcel2.writeNoException();
                                                    return true;
                                                case 25:
                                                    IUiSettingsDelegate uiSettings = getUiSettings();
                                                    parcel2.writeNoException();
                                                    iax.f(parcel2, uiSettings);
                                                    return true;
                                                case 26:
                                                    IProjectionDelegate projection = getProjection();
                                                    parcel2.writeNoException();
                                                    iax.f(parcel2, projection);
                                                    return true;
                                                case 27:
                                                    IOnCameraChangeListener asInterface8 = IOnCameraChangeListener.Stub.asInterface(parcel.readStrongBinder());
                                                    enforceNoDataAvail(parcel);
                                                    setOnCameraChangeListener(asInterface8);
                                                    parcel2.writeNoException();
                                                    return true;
                                                case 28:
                                                    IOnMapClickListener asInterface9 = IOnMapClickListener.Stub.asInterface(parcel.readStrongBinder());
                                                    enforceNoDataAvail(parcel);
                                                    setOnMapClickListener(asInterface9);
                                                    parcel2.writeNoException();
                                                    return true;
                                                case 29:
                                                    IOnMapLongClickListener asInterface10 = IOnMapLongClickListener.Stub.asInterface(parcel.readStrongBinder());
                                                    enforceNoDataAvail(parcel);
                                                    setOnMapLongClickListener(asInterface10);
                                                    parcel2.writeNoException();
                                                    return true;
                                                case 30:
                                                    IOnMarkerClickListener asInterface11 = IOnMarkerClickListener.Stub.asInterface(parcel.readStrongBinder());
                                                    enforceNoDataAvail(parcel);
                                                    setOnMarkerClickListener(asInterface11);
                                                    parcel2.writeNoException();
                                                    return true;
                                                case 31:
                                                    IOnMarkerDragListener asInterface12 = IOnMarkerDragListener.Stub.asInterface(parcel.readStrongBinder());
                                                    enforceNoDataAvail(parcel);
                                                    setOnMarkerDragListener(asInterface12);
                                                    parcel2.writeNoException();
                                                    return true;
                                                case 32:
                                                    IOnInfoWindowClickListener asInterface13 = IOnInfoWindowClickListener.Stub.asInterface(parcel.readStrongBinder());
                                                    enforceNoDataAvail(parcel);
                                                    setOnInfoWindowClickListener(asInterface13);
                                                    parcel2.writeNoException();
                                                    return true;
                                                case 33:
                                                    IInfoWindowAdapter asInterface14 = IInfoWindowAdapter.Stub.asInterface(parcel.readStrongBinder());
                                                    enforceNoDataAvail(parcel);
                                                    setInfoWindowAdapter(asInterface14);
                                                    parcel2.writeNoException();
                                                    return true;
                                                default:
                                                    switch (i) {
                                                        case 35:
                                                            CircleOptions circleOptions = (CircleOptions) iax.a(parcel, CircleOptions.CREATOR);
                                                            enforceNoDataAvail(parcel);
                                                            ICircleDelegate addCircle = addCircle(circleOptions);
                                                            parcel2.writeNoException();
                                                            iax.f(parcel2, addCircle);
                                                            return true;
                                                        case 36:
                                                            IOnMyLocationChangeListener asInterface15 = IOnMyLocationChangeListener.Stub.asInterface(parcel.readStrongBinder());
                                                            enforceNoDataAvail(parcel);
                                                            setOnMyLocationChangeListener(asInterface15);
                                                            parcel2.writeNoException();
                                                            return true;
                                                        case 37:
                                                            IOnMyLocationButtonClickListener asInterface16 = IOnMyLocationButtonClickListener.Stub.asInterface(parcel.readStrongBinder());
                                                            enforceNoDataAvail(parcel);
                                                            setOnMyLocationButtonClickListener(asInterface16);
                                                            parcel2.writeNoException();
                                                            return true;
                                                        case 38:
                                                            ISnapshotReadyCallback asInterface17 = ISnapshotReadyCallback.Stub.asInterface(parcel.readStrongBinder());
                                                            IObjectWrapper asInterface18 = IObjectWrapper.Stub.asInterface(parcel.readStrongBinder());
                                                            enforceNoDataAvail(parcel);
                                                            snapshot(asInterface17, asInterface18);
                                                            parcel2.writeNoException();
                                                            return true;
                                                        case TRANSACTION_setPadding /* 39 */:
                                                            int readInt3 = parcel.readInt();
                                                            int readInt4 = parcel.readInt();
                                                            int readInt5 = parcel.readInt();
                                                            int readInt6 = parcel.readInt();
                                                            enforceNoDataAvail(parcel);
                                                            setPadding(readInt3, readInt4, readInt5, readInt6);
                                                            parcel2.writeNoException();
                                                            return true;
                                                        case 40:
                                                            boolean isBuildingsEnabled = isBuildingsEnabled();
                                                            parcel2.writeNoException();
                                                            int i6 = iax.a;
                                                            parcel2.writeInt(isBuildingsEnabled ? 1 : 0);
                                                            return true;
                                                        case 41:
                                                            boolean g4 = iax.g(parcel);
                                                            enforceNoDataAvail(parcel);
                                                            setBuildingsEnabled(g4);
                                                            parcel2.writeNoException();
                                                            return true;
                                                        case 42:
                                                            IOnMapLoadedCallback asInterface19 = IOnMapLoadedCallback.Stub.asInterface(parcel.readStrongBinder());
                                                            enforceNoDataAvail(parcel);
                                                            setOnMapLoadedCallback(asInterface19);
                                                            parcel2.writeNoException();
                                                            return true;
                                                        default:
                                                            switch (i) {
                                                                case TRANSACTION_getMapAsync /* 53 */:
                                                                    IOnMapReadyCallback asInterface20 = IOnMapReadyCallback.Stub.asInterface(parcel.readStrongBinder());
                                                                    enforceNoDataAvail(parcel);
                                                                    getMapAsync(asInterface20);
                                                                    parcel2.writeNoException();
                                                                    return true;
                                                                case TRANSACTION_onCreate /* 54 */:
                                                                    Bundle bundle = (Bundle) iax.a(parcel, Bundle.CREATOR);
                                                                    enforceNoDataAvail(parcel);
                                                                    onCreate(bundle);
                                                                    parcel2.writeNoException();
                                                                    return true;
                                                                case TRANSACTION_onResume /* 55 */:
                                                                    onResume();
                                                                    parcel2.writeNoException();
                                                                    return true;
                                                                case TRANSACTION_onPause /* 56 */:
                                                                    onPause();
                                                                    parcel2.writeNoException();
                                                                    return true;
                                                                case TRANSACTION_onDestroy /* 57 */:
                                                                    onDestroy();
                                                                    parcel2.writeNoException();
                                                                    return true;
                                                                case TRANSACTION_onLowMemory /* 58 */:
                                                                    onLowMemory();
                                                                    parcel2.writeNoException();
                                                                    return true;
                                                                case TRANSACTION_useViewLifecycleWhenInFragment /* 59 */:
                                                                    boolean useViewLifecycleWhenInFragment = useViewLifecycleWhenInFragment();
                                                                    parcel2.writeNoException();
                                                                    int i7 = iax.a;
                                                                    parcel2.writeInt(useViewLifecycleWhenInFragment ? 1 : 0);
                                                                    return true;
                                                                case TRANSACTION_onSaveInstanceState /* 60 */:
                                                                    Bundle bundle2 = (Bundle) iax.a(parcel, Bundle.CREATOR);
                                                                    enforceNoDataAvail(parcel);
                                                                    onSaveInstanceState(bundle2);
                                                                    parcel2.writeNoException();
                                                                    iax.e(parcel2, bundle2);
                                                                    return true;
                                                                case TRANSACTION_setContentDescription /* 61 */:
                                                                    String readString = parcel.readString();
                                                                    enforceNoDataAvail(parcel);
                                                                    setContentDescription(readString);
                                                                    parcel2.writeNoException();
                                                                    return true;
                                                                default:
                                                                    switch (i) {
                                                                        case TRANSACTION_setOnPoiClickListener /* 80 */:
                                                                            IOnPoiClickListener asInterface21 = IOnPoiClickListener.Stub.asInterface(parcel.readStrongBinder());
                                                                            enforceNoDataAvail(parcel);
                                                                            setOnPoiClickListener(asInterface21);
                                                                            parcel2.writeNoException();
                                                                            return true;
                                                                        case TRANSACTION_onEnterAmbient /* 81 */:
                                                                            Bundle bundle3 = (Bundle) iax.a(parcel, Bundle.CREATOR);
                                                                            enforceNoDataAvail(parcel);
                                                                            onEnterAmbient(bundle3);
                                                                            parcel2.writeNoException();
                                                                            return true;
                                                                        case TRANSACTION_onExitAmbient /* 82 */:
                                                                            onExitAmbient();
                                                                            parcel2.writeNoException();
                                                                            return true;
                                                                        case TRANSACTION_setOnGroundOverlayClickListener /* 83 */:
                                                                            IOnGroundOverlayClickListener asInterface22 = IOnGroundOverlayClickListener.Stub.asInterface(parcel.readStrongBinder());
                                                                            enforceNoDataAvail(parcel);
                                                                            setOnGroundOverlayClickListener(asInterface22);
                                                                            parcel2.writeNoException();
                                                                            return true;
                                                                        case TRANSACTION_setOnInfoWindowLongClickListener /* 84 */:
                                                                            IOnInfoWindowLongClickListener asInterface23 = IOnInfoWindowLongClickListener.Stub.asInterface(parcel.readStrongBinder());
                                                                            enforceNoDataAvail(parcel);
                                                                            setOnInfoWindowLongClickListener(asInterface23);
                                                                            parcel2.writeNoException();
                                                                            return true;
                                                                        case TRANSACTION_setOnPolygonClickListener /* 85 */:
                                                                            IOnPolygonClickListener asInterface24 = IOnPolygonClickListener.Stub.asInterface(parcel.readStrongBinder());
                                                                            enforceNoDataAvail(parcel);
                                                                            setOnPolygonClickListener(asInterface24);
                                                                            parcel2.writeNoException();
                                                                            return true;
                                                                        case TRANSACTION_setOnInfoWindowCloseListener /* 86 */:
                                                                            IOnInfoWindowCloseListener asInterface25 = IOnInfoWindowCloseListener.Stub.asInterface(parcel.readStrongBinder());
                                                                            enforceNoDataAvail(parcel);
                                                                            setOnInfoWindowCloseListener(asInterface25);
                                                                            parcel2.writeNoException();
                                                                            return true;
                                                                        case TRANSACTION_setOnPolylineClickListener /* 87 */:
                                                                            IOnPolylineClickListener asInterface26 = IOnPolylineClickListener.Stub.asInterface(parcel.readStrongBinder());
                                                                            enforceNoDataAvail(parcel);
                                                                            setOnPolylineClickListener(asInterface26);
                                                                            parcel2.writeNoException();
                                                                            return true;
                                                                        default:
                                                                            switch (i) {
                                                                                case TRANSACTION_setMapStyle /* 91 */:
                                                                                    MapStyleOptions mapStyleOptions = (MapStyleOptions) iax.a(parcel, MapStyleOptions.CREATOR);
                                                                                    enforceNoDataAvail(parcel);
                                                                                    boolean mapStyle = setMapStyle(mapStyleOptions);
                                                                                    parcel2.writeNoException();
                                                                                    parcel2.writeInt(mapStyle ? 1 : 0);
                                                                                    return true;
                                                                                case TRANSACTION_setMinZoomPreference /* 92 */:
                                                                                    float readFloat = parcel.readFloat();
                                                                                    enforceNoDataAvail(parcel);
                                                                                    setMinZoomPreference(readFloat);
                                                                                    parcel2.writeNoException();
                                                                                    return true;
                                                                                case TRANSACTION_setMaxZoomPreference /* 93 */:
                                                                                    float readFloat2 = parcel.readFloat();
                                                                                    enforceNoDataAvail(parcel);
                                                                                    setMaxZoomPreference(readFloat2);
                                                                                    parcel2.writeNoException();
                                                                                    return true;
                                                                                case TRANSACTION_resetMinMaxZoomPreference /* 94 */:
                                                                                    resetMinMaxZoomPreference();
                                                                                    parcel2.writeNoException();
                                                                                    return true;
                                                                                case TRANSACTION_setLatLngBoundsForCameraTarget /* 95 */:
                                                                                    LatLngBounds latLngBounds = (LatLngBounds) iax.a(parcel, LatLngBounds.CREATOR);
                                                                                    enforceNoDataAvail(parcel);
                                                                                    setLatLngBoundsForCameraTarget(latLngBounds);
                                                                                    parcel2.writeNoException();
                                                                                    return true;
                                                                                case TRANSACTION_setOnCameraMoveStartedListener /* 96 */:
                                                                                    IOnCameraMoveStartedListener asInterface27 = IOnCameraMoveStartedListener.Stub.asInterface(parcel.readStrongBinder());
                                                                                    enforceNoDataAvail(parcel);
                                                                                    setOnCameraMoveStartedListener(asInterface27);
                                                                                    parcel2.writeNoException();
                                                                                    return true;
                                                                                case TRANSACTION_setOnCameraMoveListener /* 97 */:
                                                                                    IOnCameraMoveListener asInterface28 = IOnCameraMoveListener.Stub.asInterface(parcel.readStrongBinder());
                                                                                    enforceNoDataAvail(parcel);
                                                                                    setOnCameraMoveListener(asInterface28);
                                                                                    parcel2.writeNoException();
                                                                                    return true;
                                                                                case TRANSACTION_setOnCameraMoveCanceledListener /* 98 */:
                                                                                    IOnCameraMoveCanceledListener asInterface29 = IOnCameraMoveCanceledListener.Stub.asInterface(parcel.readStrongBinder());
                                                                                    enforceNoDataAvail(parcel);
                                                                                    setOnCameraMoveCanceledListener(asInterface29);
                                                                                    parcel2.writeNoException();
                                                                                    return true;
                                                                                case TRANSACTION_setOnCameraIdleListener /* 99 */:
                                                                                    IOnCameraIdleListener asInterface30 = IOnCameraIdleListener.Stub.asInterface(parcel.readStrongBinder());
                                                                                    enforceNoDataAvail(parcel);
                                                                                    setOnCameraIdleListener(asInterface30);
                                                                                    parcel2.writeNoException();
                                                                                    return true;
                                                                                default:
                                                                                    switch (i) {
                                                                                        case TRANSACTION_getMapCapabilities /* 109 */:
                                                                                            IMapCapabilitiesDelegate mapCapabilities = getMapCapabilities();
                                                                                            parcel2.writeNoException();
                                                                                            iax.f(parcel2, mapCapabilities);
                                                                                            return true;
                                                                                        case TRANSACTION_addOnMapCapabilitiesChangedListener /* 110 */:
                                                                                            IOnMapCapabilitiesChangedListener asInterface31 = IOnMapCapabilitiesChangedListener.Stub.asInterface(parcel.readStrongBinder());
                                                                                            enforceNoDataAvail(parcel);
                                                                                            addOnMapCapabilitiesChangedListener(asInterface31);
                                                                                            parcel2.writeNoException();
                                                                                            return true;
                                                                                        case TRANSACTION_removeOnMapCapabilitiesChangedListener /* 111 */:
                                                                                            IOnMapCapabilitiesChangedListener asInterface32 = IOnMapCapabilitiesChangedListener.Stub.asInterface(parcel.readStrongBinder());
                                                                                            enforceNoDataAvail(parcel);
                                                                                            removeOnMapCapabilitiesChangedListener(asInterface32);
                                                                                            parcel2.writeNoException();
                                                                                            return true;
                                                                                        case TRANSACTION_getFeatureLayer /* 112 */:
                                                                                            FeatureLayerOptions featureLayerOptions = (FeatureLayerOptions) iax.a(parcel, FeatureLayerOptions.CREATOR);
                                                                                            enforceNoDataAvail(parcel);
                                                                                            IFeatureLayerDelegate featureLayer = getFeatureLayer(featureLayerOptions);
                                                                                            parcel2.writeNoException();
                                                                                            iax.f(parcel2, featureLayer);
                                                                                            return true;
                                                                                        case TRANSACTION_setMapColorScheme /* 113 */:
                                                                                            int readInt7 = parcel.readInt();
                                                                                            enforceNoDataAvail(parcel);
                                                                                            setMapColorScheme(readInt7);
                                                                                            parcel2.writeNoException();
                                                                                            return true;
                                                                                        case TRANSACTION_getMapColorScheme /* 114 */:
                                                                                            int mapColorScheme = getMapColorScheme();
                                                                                            parcel2.writeNoException();
                                                                                            parcel2.writeInt(mapColorScheme);
                                                                                            return true;
                                                                                        default:
                                                                                            return false;
                                                                                    }
                                                                            }
                                                                    }
                                                            }
                                                    }
                                            }
                                        }
                                        onStop();
                                        parcel2.writeNoException();
                                        return true;
                                    }
                                    onStart();
                                    parcel2.writeNoException();
                                    return true;
                                }
                                IOnMyLocationClickListener asInterface33 = IOnMyLocationClickListener.Stub.asInterface(parcel.readStrongBinder());
                                enforceNoDataAvail(parcel);
                                setOnMyLocationClickListener(asInterface33);
                                parcel2.writeNoException();
                                return true;
                            }
                            IOnCircleClickListener asInterface34 = IOnCircleClickListener.Stub.asInterface(parcel.readStrongBinder());
                            enforceNoDataAvail(parcel);
                            setOnCircleClickListener(asInterface34);
                            parcel2.writeNoException();
                            return true;
                        }
                        ISnapshotReadyCallback asInterface35 = ISnapshotReadyCallback.Stub.asInterface(parcel.readStrongBinder());
                        enforceNoDataAvail(parcel);
                        snapshotForTest(asInterface35);
                        parcel2.writeNoException();
                        return true;
                    }
                    boolean g5 = iax.g(parcel);
                    enforceNoDataAvail(parcel);
                    setWatermarkEnabled(g5);
                    parcel2.writeNoException();
                    return true;
                }
                IOnIndoorStateChangeListener asInterface36 = IOnIndoorStateChangeListener.Stub.asInterface(parcel.readStrongBinder());
                enforceNoDataAvail(parcel);
                setOnIndoorStateChangeListener(asInterface36);
                parcel2.writeNoException();
                return true;
            }
            IIndoorBuildingDelegate focusedBuilding = getFocusedBuilding();
            parcel2.writeNoException();
            iax.f(parcel2, focusedBuilding);
            return true;
        }
    }

    ICircleDelegate addCircle(CircleOptions circleOptions);

    IGroundOverlayDelegate addGroundOverlay(GroundOverlayOptions groundOverlayOptions);

    IMarkerDelegate addMarker(MarkerOptions markerOptions);

    void addOnMapCapabilitiesChangedListener(IOnMapCapabilitiesChangedListener iOnMapCapabilitiesChangedListener);

    IPolygonDelegate addPolygon(PolygonOptions polygonOptions);

    IPolylineDelegate addPolyline(PolylineOptions polylineOptions);

    ITileOverlayDelegate addTileOverlay(TileOverlayOptions tileOverlayOptions);

    void animateCamera(IObjectWrapper iObjectWrapper);

    void animateCameraWithCallback(IObjectWrapper iObjectWrapper, ICancelableCallback iCancelableCallback);

    void animateCameraWithDurationAndCallback(IObjectWrapper iObjectWrapper, int i, ICancelableCallback iCancelableCallback);

    void clear();

    CameraPosition getCameraPosition();

    IFeatureLayerDelegate getFeatureLayer(FeatureLayerOptions featureLayerOptions);

    IIndoorBuildingDelegate getFocusedBuilding();

    void getMapAsync(IOnMapReadyCallback iOnMapReadyCallback);

    IMapCapabilitiesDelegate getMapCapabilities();

    int getMapColorScheme();

    int getMapType();

    float getMaxZoomLevel();

    float getMinZoomLevel();

    Location getMyLocation();

    IProjectionDelegate getProjection();

    IUiSettingsDelegate getUiSettings();

    boolean isBuildingsEnabled();

    boolean isIndoorEnabled();

    boolean isMyLocationEnabled();

    boolean isTrafficEnabled();

    void moveCamera(IObjectWrapper iObjectWrapper);

    void onCreate(Bundle bundle);

    void onDestroy();

    void onEnterAmbient(Bundle bundle);

    void onExitAmbient();

    void onLowMemory();

    void onPause();

    void onResume();

    void onSaveInstanceState(Bundle bundle);

    void onStart();

    void onStop();

    void removeOnMapCapabilitiesChangedListener(IOnMapCapabilitiesChangedListener iOnMapCapabilitiesChangedListener);

    void resetMinMaxZoomPreference();

    void setBuildingsEnabled(boolean z);

    void setContentDescription(String str);

    boolean setIndoorEnabled(boolean z);

    void setInfoWindowAdapter(IInfoWindowAdapter iInfoWindowAdapter);

    void setLatLngBoundsForCameraTarget(LatLngBounds latLngBounds);

    void setLocationSource(ILocationSourceDelegate iLocationSourceDelegate);

    void setMapColorScheme(int i);

    boolean setMapStyle(MapStyleOptions mapStyleOptions);

    void setMapType(int i);

    void setMaxZoomPreference(float f);

    void setMinZoomPreference(float f);

    void setMyLocationEnabled(boolean z);

    void setOnCameraChangeListener(IOnCameraChangeListener iOnCameraChangeListener);

    void setOnCameraIdleListener(IOnCameraIdleListener iOnCameraIdleListener);

    void setOnCameraMoveCanceledListener(IOnCameraMoveCanceledListener iOnCameraMoveCanceledListener);

    void setOnCameraMoveListener(IOnCameraMoveListener iOnCameraMoveListener);

    void setOnCameraMoveStartedListener(IOnCameraMoveStartedListener iOnCameraMoveStartedListener);

    void setOnCircleClickListener(IOnCircleClickListener iOnCircleClickListener);

    void setOnGroundOverlayClickListener(IOnGroundOverlayClickListener iOnGroundOverlayClickListener);

    void setOnIndoorStateChangeListener(IOnIndoorStateChangeListener iOnIndoorStateChangeListener);

    void setOnInfoWindowClickListener(IOnInfoWindowClickListener iOnInfoWindowClickListener);

    void setOnInfoWindowCloseListener(IOnInfoWindowCloseListener iOnInfoWindowCloseListener);

    void setOnInfoWindowLongClickListener(IOnInfoWindowLongClickListener iOnInfoWindowLongClickListener);

    void setOnMapClickListener(IOnMapClickListener iOnMapClickListener);

    void setOnMapLoadedCallback(IOnMapLoadedCallback iOnMapLoadedCallback);

    void setOnMapLongClickListener(IOnMapLongClickListener iOnMapLongClickListener);

    void setOnMarkerClickListener(IOnMarkerClickListener iOnMarkerClickListener);

    void setOnMarkerDragListener(IOnMarkerDragListener iOnMarkerDragListener);

    void setOnMyLocationButtonClickListener(IOnMyLocationButtonClickListener iOnMyLocationButtonClickListener);

    void setOnMyLocationChangeListener(IOnMyLocationChangeListener iOnMyLocationChangeListener);

    void setOnMyLocationClickListener(IOnMyLocationClickListener iOnMyLocationClickListener);

    void setOnPoiClickListener(IOnPoiClickListener iOnPoiClickListener);

    void setOnPolygonClickListener(IOnPolygonClickListener iOnPolygonClickListener);

    void setOnPolylineClickListener(IOnPolylineClickListener iOnPolylineClickListener);

    void setPadding(int i, int i2, int i3, int i4);

    void setTrafficEnabled(boolean z);

    void setWatermarkEnabled(boolean z);

    void snapshot(ISnapshotReadyCallback iSnapshotReadyCallback, IObjectWrapper iObjectWrapper);

    void snapshotForTest(ISnapshotReadyCallback iSnapshotReadyCallback);

    void stopAnimation();

    boolean useViewLifecycleWhenInFragment();
}
