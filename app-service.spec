Summary: APP SERVICE RPM
Name: APP_SERVICE
Version: 3.4.0
Release: 2
Source: app-service.tar
Prefix: /usr/app-service
Buildroot: %{_tmppath}/%{name}-%{version}-%{release}-root
License: GPL
Packager: bite@hisense.com
Group: Application
URL: http://hitv.hisense.com
Vendor: HISENSE MEDIA NETWORKS Co.Ltd
Distribution: SUSE Linux Enterprise 11 SP1 & SP2
%description 
Provide service interface to API or the other NE.mainly process account business.


# do not repack jar files
%define __os_install_post %{nil}
%define __jar_repack %{nil}
%define debug_package %{nil}
%prep
%setup -c
%pre
	num=`ps -ef|grep app-service.jar|grep -v grep|wc -l`
	if [ $num -gt 0 ]
	then
	     kill -9 `ps -ef|grep app-service.jar|grep -v grep|awk '{print $2}'`
	fi
	
%install
rm -rf ${RPM_BUILD_ROOT}/usr/*
mkdir -p ${RPM_BUILD_ROOT}/usr/
cp -ar ${RPM_BUILD_DIR}/%{name}-%{version}/app-service ${RPM_BUILD_ROOT}/usr/app-service
%files
/usr/app-service
%defattr(755,root,root)
%clean
rm -rf ${RPM_BUILD_ROOT}
rm -rf ${RPM_BUILD_DIR}/*
